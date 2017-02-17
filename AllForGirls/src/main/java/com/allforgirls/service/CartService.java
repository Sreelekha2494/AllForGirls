package com.allforgirls.service;

import com.allforgirls.model.Cart;


public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
