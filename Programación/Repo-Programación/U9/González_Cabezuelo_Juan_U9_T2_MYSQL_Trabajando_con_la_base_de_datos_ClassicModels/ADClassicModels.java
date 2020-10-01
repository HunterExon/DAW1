package com.juan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {
    public List<Employee> getEmpleados(){
        
        Connection con = ConexionBD.getConnection();
        List<Employee> empl = new ArrayList<>();
        
        try {
            Statement sta = con.createStatement();
            statement.setQueryTimeout(60);
            ResultSet res = sta.executeQuery("select * from employees");

            while (res.next()){
                Employee emp = new Employee(
                        res.getInt("employeeNumber"),
                        res.getString("lastName"),
                        res.getString("firstName"),
                        res.getString("extension"),
                        res.getString("email"),
                        res.getString("officeCode"),
                        res.getInt("reportsTo"),
                        res.getString("jobTitle")
                );
                empl.add(emp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        con.close();
        return empl;
    }

    public List<Office> getOffices() {

        Connection con = ConexionDB.getConnection();
        List<Office> offl = new ArrayList<>();

        try {
            Statement sta = con.createStatement();
            statement.setQueryTimeout(60);
            ResultSet res = sta.executeQuery("select * from offices");

            while (res.next()) {
                Office off = new Office(
                        res.getString("officeCode"),
                        res.getString("city"),
                        res.getString("phone"),
                        res.getString("addressLine1"),
                        res.getString("addressLine2"),
                        res.getString("state"),
                        res.getString("country"),
                        res.getString("postalCode"),
                        res.getString("territory")
                );
                offl.add(off);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        con.close();
        return offl;
    }
}
