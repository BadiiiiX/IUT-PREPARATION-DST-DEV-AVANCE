package fr.badiiix.project;

import java.io.*;

import fr.badiiix.project.entities.Client;
import fr.badiiix.project.persistence.PersistenceBuilder;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PersistenceBuilder p = new PersistenceBuilder();
        Client c = p.registerClient("BadiiX", "Paris");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + c.getNom() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}