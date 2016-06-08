package WebPhoneBoock;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

/**
 * Created by rysja on 02.06.16.
 */
public class DeleteContact extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String dellParameter = req.getParameter("dropListDell");

        if (dellParameter.equals("Phon number")){RequestDispatcher view = req.getRequestDispatcher("DeleteByPhoneNumber.jsp");
            view.forward(req, resp);}
        else if (dellParameter.equals("Id")){RequestDispatcher view = req.getRequestDispatcher("DeleteById.jsp");
            view.forward(req, resp);}
        else if (dellParameter.equals("Name")){RequestDispatcher view = req.getRequestDispatcher("DeleteByName.jsp");
            view.forward(req, resp);}





    }
}
