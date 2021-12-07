/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/18/21, 3:23 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.genrics.problem;

import java.util.Date;

public class TestProblems {
    public static void main(String[] args) {
        Book book1 = new Book();
        BookOperations oper1 =  new BookOperations();
        oper1.insert(book1);
        oper1.deleted(book1);
        NewsPaper news1 = new NewsPaper("ahram",new Date());
        NewsPaperOperations oper2 = new NewsPaperOperations();
        oper2.insert(news1);
        oper2.delete(news1);
    }
}
