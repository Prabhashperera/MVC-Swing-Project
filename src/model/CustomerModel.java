/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dto.CustomerDto;
import java.sql.*;
import db.DBConnection;
import java.util.ArrayList;
import java.util.List;

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
    public String deleteCustomer(String id) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, id);
        
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Deleted" : "Fail";
    }
            
    public CustomerDto searchCustomer(String id) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        
        ResultSet rst = statement.executeQuery();
        if(rst.next()){
            CustomerDto dto = new CustomerDto(rst.getString(1),
                    rst.getString(2), rst.getString(3),
                    rst.getString(4), rst.getDouble(5),
                    rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getString(9));
            
            return  dto;
        }
        
        return null;
    }
    public List<CustomerDto> getAllCustomer() throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        List<CustomerDto> customerDtos = new ArrayList<>();
        
        ResultSet rst = statement.executeQuery();
        while(rst.next()){
            CustomerDto dto = new CustomerDto(rst.getString(1),
                    rst.getString(2), rst.getString(3),
                    rst.getString(4), rst.getDouble(5),
                    rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getString(9));
            customerDtos.add(dto);
        }
        
        return customerDtos;
    }
    
}
