package com.example.spring.servise;

import com.example.spring.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceIml implements OrderService{

    private final Cart cart;

    public OrderServiceIml(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> itemsId) {
        return cart.addItems(itemsId);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
