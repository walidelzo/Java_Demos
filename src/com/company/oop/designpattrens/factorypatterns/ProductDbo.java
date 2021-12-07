/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 2021.                                         -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.designpattrens.factorypatterns;

public interface ProductDbo {
    public void saveProduct(Product pro);
    public  void updateProduct(Product pro);
    public Product findById(int id);
}
