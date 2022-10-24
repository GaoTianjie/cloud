package com.sky.cloud.design;

import java.util.Objects;

public class FactoryMethod {
    public static void main(String[] args) {
        new ProductFactory().create("0").method();
        new ProductFactory().create("1").method();
    }
}

class ProductFactory {
    public Product create(String type) {
        if (Objects.equals(type, "0")) {
            return new ProductA();
        } else if (Objects.equals(type, "1")) {
            return new ProductB();
        } else {
            return null;
        }
    }
}

interface Product {
    void method();
}

class ProductA implements Product {
    @Override
    public void method() {
        System.out.println("ProductA method ... ");
    }
}

class ProductB implements Product {
    @Override
    public void method() {
        System.out.println("ProductB method ... ");
    }
}