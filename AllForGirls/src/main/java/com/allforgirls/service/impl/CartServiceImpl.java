package com.allforgirls.service.impl;

import com.allforgirls.dao.CartDao;
import com.allforgirls.model.Cart;
import com.allforgirls.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart) {
        cartDao.update(cart);
    }
}
