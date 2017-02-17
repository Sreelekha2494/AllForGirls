package com.allforgirls.service;

import com.allforgirls.model.Cart;
import com.allforgirls.model.CartItem;


public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);
}
