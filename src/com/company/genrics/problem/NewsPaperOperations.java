/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/18/21, 3:21 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.genrics.problem;

public class NewsPaperOperations {
    public void insert(NewsPaper newsPaper){
        System.out.println( newsPaper.getClass() .getName()+ "  inserted..");
    }
    public void delete(NewsPaper newsPaper){
        System.out.println(newsPaper.getClass().getName()+"  deleted...."  );
    }
}
