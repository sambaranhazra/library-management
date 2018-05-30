package org.sambaran.library.api;

import org.sambaran.library.model.Book;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
public class LibraryApi {

    @GET
    public Response getAllBooks(){
        Book firstBook=new Book();
        firstBook.setId(1);
        firstBook.setIsbn("123-45678-123");
        firstBook.setName("Head First Java");

        Book secondBook=new Book();
        secondBook.setId(2);
        secondBook.setIsbn("234-5657-221");
        secondBook.setName("Clean Code");

        List<Book> books=new ArrayList<>();
        books.add(firstBook);
        books.add(secondBook);
        return Response.ok(books).build();
    }
}
