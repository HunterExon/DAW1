package com.fpdualbbdd.view;

import com.fpdualbbdd.data.DataConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class View {
	static int op;
	/*OBJETO QUE CONECTA*/
	private static DataConnection mc = DataConnection.getInstance();
	
	public static void main(String[] args) throws Exception {
		menu();
		op=readInt();
		System.out.println("|----------------------------|");
		exmenu(op);
	}

	private static String readString() throws Exception {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		return br.readLine();
	}
	
	private static int readInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		}
	
	public static void menu(){
    	System.out.println("|============================|");
		System.out.println("|            MENÚ            |");
    	System.out.println("|----------------------------|");
		System.out.println("|  1. Añadir nuevo producto  |");
		System.out.println("|  2. Ver productos          |");
		System.out.println("|  3. Modificar producto     |");
		System.out.println("|  4. Borrar producto        |");
		System.out.println("|  0. Salir                  |");
    	System.out.println("|============================|");
		System.out.print("|--");
	}
	
	private static void exmenu(int op2) throws Exception {
		String nom;
		String cat;
		boolean ok=false;
		
		switch (op2) {
		
		case 1:			
			/*AÑADIR PRODUCTO*/
			System.out.print("|--NOMBRE: ");
			nom=readString();
			System.out.print("|--CATEGORÍA: ");
			cat=readString();
			addProd(nom,cat);
			System.out.println("|----------------------------|");
			System.out.println("|      PRODUCTO AÑADIDO      |");
			break;
			
		case 2:
			/*CONSULTAR TODOS LOS PRODUCTOS*/
			mostraProds();
			break;
			
		case 3:			
			/*MODIFICAR PRODUCTO*/
			System.out.print("|--NOMBRE: ");
			nom=readString();
			System.out.print("|--CATEGORÍA: ");
			cat=readString();
			updateProd(nom,cat);
			System.out.println("|----------------------------|");
			System.out.println("|    PRODUCTO ACTUALIZADO    |");
			break;
			
		case 4:			
			/*BORRAR PRODUCTO*/
			System.out.print("|--NOMBRE: ");
			nom=readString();
			System.out.print("|--CATEGORÍA: ");
			cat=readString();
			deleteProd(nom,cat);
			System.out.println("|----------------------------|");
			System.out.println("|     PRODUCTO ELIMINADO     |");
			break;
			
		case 0:
			System.out.println("|----------------------------|");
			System.out.println("|      CONEXIÓN CERRADA      |");
			System.out.println("|============================|");
			mc.closeConnection(); /*ESTO CIERRA LA CONEXIÓN AL TERMINAR*/
			break;
			
		default:
			menu();
			op=readInt();
			exmenu(op);
		break;
		
		}
		if(op!=0){
			System.out.println("|----------------------------|");
			System.out.println("|    ENTER PARA CONTINUAR    |");
			System.out.println("|============================|");
			String nada=readString();/*NO SE USA, ES PARA PAUSAR*/
									 /*POR SI HA DE SALIR OTRA VEZ EL MENU SE EJECUTA DE NUEVO*/
			menu();
			op=readInt();
			exmenu(op);
		}
	}
	
	
	
	/*METODOS*/
	static void addProd(String nom,String cat){
		try {
			mc.insertarProducto(nom,cat);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	static void mostraProds(){
		try {
			for (int i = 0; i < mc.devolverProducto().size(); i++) {
				System.out.println("| "+mc.devolverProducto().get(i).toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void updateProd(String nom,String cat){
		try {
			mc.modificarProducto(nom,cat);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void deleteProd(String nom,String cat){
		try {
			mc.deleteProducto(nom,cat);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}