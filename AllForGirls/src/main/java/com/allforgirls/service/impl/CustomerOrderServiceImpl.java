package com.allforgirls.service.impl;

import com.allforgirls.dao.CustomerOrderDao;
import com.allforgirls.model.Cart;
import com.allforgirls.model.CartItem;
import com.allforgirls.model.CustomerOrder;
import com.allforgirls.service.CartService;
import com.allforgirls.service.CustomerOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal+=item.getTotalPrice();
        }

        return grandTotal;
    }
}
