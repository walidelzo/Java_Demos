/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/17/21, 7:51 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.designpattrens.factorypatterns;

public class TestClass {
    public static void main(String[] args) {
        Product book = new Product();
        book.setName("quran");
        book.setSize(30);
        ProductDbo pf =new ProductFactory().newInstanceFromProductImp();
        pf.saveProduct(book);
        pf.updateProduct(book);
    }
}
