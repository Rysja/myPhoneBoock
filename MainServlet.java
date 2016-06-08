package WebPhoneBoock;

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


        String parameter = req.getParameter("dropList");
        if (parameter.equals("Add contact")) {
            RequestDispatcher view = req.getRequestDispatcher("AddContact.jsp");
            view.forward(req, resp);
        } else if (parameter.equals("Delete contact")) {
            RequestDispatcher view = req.getRequestDispatcher("DeleteContact.jsp");
            view.forward(req, resp);
        } else if (parameter.equals("View contacts")) {
            RequestDispatcher view = req.getRequestDispatcher("ViewContacts.jsp");
            view.forward(req, resp);

        } else {
            RequestDispatcher view = req.getRequestDispatcher("UpdateContact.jsp");
            view.forward(req, resp);
        }

    }
}
