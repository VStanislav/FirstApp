package org.example;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductServlet" , urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        out.printf("<html><body>");

        for (int i = 0; i < 10; i++) {
            out.printf("<h1>"
                    + new Products(i,"Product"+i,(Math.random()*1000))
                    + "</h1>");
        }

        out.printf("</body></html>");
        out.close();
    }
    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}
