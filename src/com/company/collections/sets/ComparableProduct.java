/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/20/21, 11:46 AM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.collections.sets;

import java.util.Comparator;

public class ComparableProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int result = o1.getName().compareTo(o2.getName());
        return 0;
    }
}
