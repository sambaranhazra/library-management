package org.sambaran.library;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class SampleServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer=response.getWriter();
        writer.println("<html><body>");
        writer.println("<h3>Hello</h3>");
        writer.println("</body></html>");

    }
}
