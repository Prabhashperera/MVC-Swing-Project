/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.CustomerDto;
import java.sql.SQLException;
import java.util.List;
import model.CustomerModel;

/**
 *
 * @author User
 */
public class CustomerController {
    private CustomerModel customerModel = new CustomerModel();
    
    public String saveCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException {
        String resp = customerModel.saveCustomer(dto);
        return resp;
    }
    
    public String updateCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException {
        String resp = customerModel.updateCustomer(dto);
        return resp;
    }
    
    public String deleteCustomer(String customerId) throws Exception {
        String resp = customerModel.deleteCustomer(customerId);
        return resp;
    }
    
    public CustomerDto searchCustomer(String customerId) throws Exception{
        CustomerDto dto = customerModel.searchCustomer(customerId);
        return dto;
    }
    public List<CustomerDto> getAllCustomer() throws Exception{
        List<CustomerDto> dtos = customerModel.getAllCustomer();
        return dtos;
    }
}
