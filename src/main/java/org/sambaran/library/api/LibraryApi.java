package org.sambaran.library.api;

import org.sambaran.library.ejb.BookService;
import org.sambaran.library.model.Book;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LibraryApi {

    @EJB
    private
    BookService bookService;

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
    /*@GET
    public Response getAllBooks() {
        return Response.ok(bookService.getBooks()).build();
    }*/

    @POST
    public Response addBook(@Valid Book book) {
        return Response.ok(bookService.addBook(book)).build();
    }

    @GET
    @Path("{id}")
    public Response getBookById(@PathParam("id") int id) {
        return Response.ok(bookService.getBookById(id)).build();
    }
}
