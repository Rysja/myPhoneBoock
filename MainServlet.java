package ff;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by rysja on 30.05.16.
 */
public class MainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String c = req.getParameter("color");
        if (c.equals("View contats")) {

            out.println("<br>Got beer color " + c);
            RequestDispatcher view=req.getRequestDispatcher("a.jsp");
            view.forward(req,resp);
        }else {out.print("hgjhgjhgjhgj");}

    }
}
