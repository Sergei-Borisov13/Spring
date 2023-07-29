package com.example.spring.servise;

import java.util.List;

public interface OrderService {

    List<Integer> addItems(List<Integer> itemsId);

    List<Integer> getItems();
}
