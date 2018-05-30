package org.sambaran.library.ejb;

import org.sambaran.library.annotation.Books;
import org.sambaran.library.model.Book;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class BookService {

    @Books
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBooks() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }
}
