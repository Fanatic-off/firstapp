package com.geekbrains.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
//@Scope (scopeName = "prototype") //помечает красным Scope
public class Cart {
    private List<Product> productsCart;

    @Autowired
    private ProductRepository repository;

    public Cart() {
        this.repository = repository;
        this.productsCart = productsCart;
    }

    public void add(Product product) {
        productsCart.add(product);
    }

    public void add(long id) {
        productsCart.add(repository.searchProductByID(id));
    }


}
