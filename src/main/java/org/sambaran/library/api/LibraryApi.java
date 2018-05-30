package org.sambaran.library.api;

import org.sambaran.library.ejb.BookService;
import org.sambaran.library.model.Book;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LibraryApi {

    @Inject
    BookService bookService;

    @GET
    public Response getAllBooks() {
        return Response.ok(bookService.getBooks()).build();
    }

    @POST
    public void addBook(Book book) {
        bookService.addBook(book);
    }

    @GET
    @Path("{id}")
    public Response getBookById(@PathParam("id") int id){
        return Response.ok(bookService.getBookById(id)).build();
    }
}
