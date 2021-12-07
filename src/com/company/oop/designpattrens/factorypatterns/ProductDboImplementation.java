/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 2021.                                         -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.designpattrens.factorypatterns;

public class ProductDboImplementation implements ProductDbo {
    @Override
    public void saveProduct(Product pro) {
        System.out.println("saved ...."+pro.getName());
    }

    @Override
    public void updateProduct(Product pro) {
        System.out.println("updated...."+pro.getName());
    }

    @Override
    public Product findById(int id) {
        return new Product();
    }
}
