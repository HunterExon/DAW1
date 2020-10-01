package com.juan;
import java.sql.*;

public class DBConnect{
    private static Connection con = null;
    public static Connection getConnection(){
        try {
            if(con == null){
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost/classicmodels?autoReconnect=true";
                String pwd = "root";
                String usr = "root";
                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pwd);
                System.out.println("|==CONEXIÓN CORRECTA==|");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public static Connection DBClose(){
        try{
            if (con != null){
                System.out.println("|==CONEXIÓN CERRADA==|");
                con.close();
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
