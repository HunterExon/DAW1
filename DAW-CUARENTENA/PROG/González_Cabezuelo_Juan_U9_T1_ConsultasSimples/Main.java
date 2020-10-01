package com.juan;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection con = null;
        try {
            /*CONEXIÓN A BASE DE DATOS*/
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Juan\\Escritorio\\sampledatabase.db");
            Statement statement = con.createStatement();
            statement.setQueryTimeout(60);

            /*PRIMERA CONSULTA*/
            System.out.println("Listado de los `customers` que no tienen `state` (el campo `state` es nulo)");
            ResultSet rs = statement.executeQuery("select * from customers where state is null");
            while(rs.next()) {
                System.out.println(rs.getString("customerName"));
            }

            /*SEGUNDA CONSULTA*/
            System.out.println("Listado de los `payments` cuyo `amount` sea mayor de 30.000");
            rs = statement.executeQuery("select customerNumber, amount from payments WHERE amount > 30000");
            while(rs.next()){
                System.out.println("Nombre: "+rs.getInt("customerNumber"+" | "+"Ctd: "+rs.getInt("amount")));
            }

            /*TERCERA CONSULTA*/
            System.out.println("Consulta que devuelve el listado de los \"employees\" que dan cuenta (reportsTo) al empleado con Id = 1143");
            rs = statement.executeQuery("SELECT * FROM employees WHERE reportsTo = 1143 ");
            while(rs.next()){
                System.out.println("Nombre: "+rs.getString("lastName")+" | "+"Apellido: "+rs.getString("firstName"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            /*CON ESTE TRY LO UNICO QUE HAREMOS SERÁ CERRAR LA CONEXIÓN A LA BASE DE DATOS*/
        } try {
            if(con != null) {
                con.close();
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
