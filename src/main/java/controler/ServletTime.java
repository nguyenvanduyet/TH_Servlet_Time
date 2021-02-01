package controler;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "ServletTime", urlPatterns = "/index")
public class ServletTime extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        Date today= new Date();
        writer.println("<h1>"+today+"</h1>");
        writer.println("</html>");
    }
}
