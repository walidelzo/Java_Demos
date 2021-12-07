/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/18/21, 3:04 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.genrics;

import com.company.genrics.problem.Book;
import com.company.genrics.problem.NewsPaper;

import java.util.Date;

public class TestClass {
    public static void main(String[] args) {
        GenericClassInsertAndDelete<Book> bookOperation = new GenericClassInsertAndDelete<Book>();
        Book book = new Book();
        bookOperation.insert(book);
        bookOperation.delete(book);
        GenericClassInsertAndDelete<NewsPaper> newsPaperOperation = new GenericClassInsertAndDelete<>();
        NewsPaper newsPaper = new NewsPaper("Ahram",new Date());
        newsPaperOperation.insert(newsPaper);
        newsPaperOperation.delete(newsPaper);
    }
}
