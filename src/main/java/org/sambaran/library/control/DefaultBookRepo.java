package org.sambaran.library.control;

import org.sambaran.library.model.Book;

import javax.enterprise.inject.Produces;
import java.util.ArrayList;
import java.util.List;

public class DefaultBookRepo {

    @Produces
    public List<Book> getBooks(){
        return new ArrayList<>();
    }
}
