/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import db.DBConnection;


/**
 *
 * @author User
 */
public class ItemModel {
    public void saveItem() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        
        String query = "INSERT INTO item values(?, ?, ?, ?, ?)";
        PreparedStatement stm = conn.prepareStatement(query);
        
    }
}
