package org.sambaran.library.api;

import org.sambaran.library.model.Book;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
public class LibraryApi {

    @GET
    public Response getAllBooks(){
        Book book=new Book();
        book.setId(1);
        book.setIsbn("123-45678-123");
        book.setName("Head First Java");
        return Response.ok(book).build();
    }
}
