package com.fpdualbbdd.data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;

public class DataConnection {
	/*ATRIBUTOS*/
	private static Connection con;
	private static DataConnection INSTANCE = null;
	
	private DataConnection() {};
	
	public static void performConnection() {
		String hostport = "localhost:3306";
		String user = "root";
        String pass = "root";
        String nombreSchema = "bd_fpdual";
       
        try{
        	Class.forName("com.mysql.jdbc.Driver");
        	con = DriverManager.getConnection("jdbc:mysql://" + hostport + "/" + nombreSchema + "?autoReconnect=true&useSSL=false", user, pass);
        	System.out.println("  |========================|");
        	System.out.println("  |  CONEXIÓN ESTABLECIDA  |");
        	System.out.println("  |========================|");
			System.out.println();
        }catch (Exception e) {
			System.out.println();
        	System.out.println("  |==============================|");
        	System.out.println("  |  ERROR AL ABRIR LA CONEXIÓN  |");
        	System.out.println("  |==============================|");
        }
    }
	
	/*CREA UNA INSTANCIA DE CONEXIÓN PERO ESTO NO ES LO MÁS ÓPTIMO*/
	private synchronized static void createInstance() {
		if(INSTANCE == null) {
			INSTANCE = new DataConnection();
			performConnection();
		}
	}
	
	/*OBTENEMOS UNA INSTANCIA PERO SI EXISTE DEVUELVE LA YA INSTANCIADA*/
	public static DataConnection getInstance() {
		if(INSTANCE ==null) createInstance();
		return INSTANCE;
	}
	
	/*CON ESTO CERRAMOS LA CONEXIÓN*/
	public void closeConnection() {
		try {
			con.close();
		}catch(Exception e) {
			System.out.println();
        	System.out.println("  |===================================|");
        	System.out.println("  |  ERROR AL ESTABLECER LA CONEXIÓN  |");
        	System.out.println("  |===================================|");
		}
	}
	
	private static String readString() throws Exception {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		return br.readLine();
	}
	
	
	/*MÉTODO PARA SACAR POR PANTALLA TODOS LOS DATOS DE "PRODUCTO"*/
	public ArrayList<String> devolverProducto() throws SQLException{
		ArrayList<String> ls = new ArrayList<String>();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM producto");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			ls.add(rs.getString("idproducto")+" - "+rs.getString("nombre")+" - "+rs.getString("categoria"));
		}
		rs.close();
		return ls;
	}
	
	/*AÑADO A LA BASE DE DATOS UN PRODUCTO NUEVO CON NOMBRE Y CATEGORIA EN LAS COLUMNAS 1 Y 2, 
	LA 0 ES EL ID QUE SE AUTOINCREMENTA SOLO POR COMO LO HEMOS PUESTO*/
	public void insertarProducto(String nom, String cat) throws SQLException {
		String seleccion = "INSERT INTO `Producto` (`nombre`,`categoria`)VALUES (?,?)";
		PreparedStatement ps = con.prepareStatement(seleccion);
		ps.setString(1, nom);
		ps.setString(2, cat);
		ps.executeUpdate();
	}
	
	/*CON ESTO VAMOS A BORRAR UN PRODUCTO CONCRETO*/
	public void deleteProducto(String nom, String cat) throws SQLException {
		try{
			String seleccion = "DELETE FROM `Producto` WHERE `nombre` = ? AND `categoria` = ?";
			PreparedStatement ps = con.prepareStatement(seleccion);
			ps.setString(1, nom);
			ps.setString(2, cat);
			ps.execute();
		}
		catch (Exception e){
			System.out.println();
        	System.out.println("  |===============================|");
        	System.out.println("  |  ERROR AL BORRAR EL PRODUCTO  |");
        	System.out.println("  |===============================|");
	    }
	}
	
	/*CON ESTO VAMOS A MODIFICAR UN PRODUCTO CONCRETO*/
	public void modificarProducto(String nom, String cat) throws SQLException {
		String nom2;
		String cat2;
		try{
			System.out.print("|--NUEVO NOMBRE: ");
			nom2=readString();
			System.out.print("|--NUEVA CATEGORÍA: ");
			cat2=readString();

			String seleccion = "UPDATE `Producto` SET `nombre` = ?, `categoria` = ? WHERE `nombre` = ? AND `categoria` = ?";
			PreparedStatement ps = con.prepareStatement(seleccion);
			ps.setString(1, nom2);
			ps.setString(2, cat2);
			ps.setString(3, nom);
			ps.setString(4, cat);
			ps.executeUpdate();
		}
		catch (Exception e){
			System.out.println();
			System.out.println("  |===============================|");
			System.out.println("  |  ERROR AL BORRAR EL PRODUCTO  |");
			System.out.println("  |===============================|");
	    }
	}	
}
