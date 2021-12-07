/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 2021.                                         -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.designpattrens.factorypatterns;

public class ProductFactory {
    public ProductDbo newInstanceFromProductImp(){
        return new ProductDboImplementation();
    }
}
