package org.sambaran.library.ejb;

import org.sambaran.library.model.Book;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Stateless
public class BookService {
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBooks() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Book getBookById(int id) {
        return bookList.stream().filter(b->b.getId()==id).findAny().orElse(null);
    }
}
