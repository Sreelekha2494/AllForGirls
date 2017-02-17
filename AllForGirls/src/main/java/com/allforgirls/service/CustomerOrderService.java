package com.allforgirls.service;

import com.allforgirls.model.CustomerOrder;


public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
