package com.allforgirls.service.impl;

import com.allforgirls.dao.CustomerDao;
import com.allforgirls.model.Customer;
import com.allforgirls.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer (Customer customer) {
        customerDao.addCustomer(customer);
    }

    public Customer getCustomerById(int customerId) {
        return customerDao.getCustomerById(customerId);
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public Customer getCustomerByUsername (String username) {
        return customerDao.getCustomerByUsername(username);
    }
}
