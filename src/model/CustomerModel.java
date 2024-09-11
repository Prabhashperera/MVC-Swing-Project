/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dto.CustomerDto;
import java.sql.*;
import db.DBConnection;

/**
 *
 * @author User
 */
public class CustomerModel {
    public String saveCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String query = "INSERT INTO Customer Values (?, ?, ?, ?,?,?,?,?,?)";
        
        PreparedStatement stm = conn.prepareStatement(query);
        stm.setString(1, dto.getId());
        stm.setString(2, dto.getTitle());
        stm.setString(3, dto.getName());
        stm.setString(4, dto.getDob());
        stm.setDouble(5, dto.getSalary());
        stm.setString(6, dto.getAddress());
        stm.setString(7, dto.getCity());
        stm.setString(8, dto.getProvince());
        stm.setString(9, dto.getPostalCode());
        
        int rows = stm.executeUpdate();
        
        return rows < 0 ? "Success" : "Failed";
       
    }
        public String updateCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String query = "UPDATE Customer CustTitle = ?, CustName = ?, DOB = ? , salary = ?, "
                + "CustAddress = ?, City = ?, Province = ? , PostalCode = ? WHERE CustID = ? ";
        
        PreparedStatement stm = conn.prepareStatement(query);
        stm.setString(1, dto.getTitle());
        stm.setString(2, dto.getName());
        stm.setString(3, dto.getDob());
        stm.setDouble(4, dto.getSalary());
        stm.setString(5, dto.getAddress());
        stm.setString(6, dto.getCity());
        stm.setString(7, dto.getProvince());
        stm.setString(8, dto.getPostalCode());
        stm.setString(9, dto.getId());

        
        int rows = stm.executeUpdate();
        
        return rows < 0 ? "Success" : "Failed";
       
    }
}
