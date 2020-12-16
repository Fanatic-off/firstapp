package com.geekbrains.app;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product searchProductByID (long id){
        return getProducts().get((int) id);
    }

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1,"mouse",100));
        products.add(new Product(2,"keyboard",150));
        products.add(new Product(3,"flowers",500));
        products.add(new Product(4,"chair",1000));
        products.add(new Product(5,"coffee",25));

    }

    public void add(Product product) {
        if (product.getCost() < 0) {
            throw new RuntimeException("The product cost cannot be less than 0!");
        }
        products.add(product);
    }
}
