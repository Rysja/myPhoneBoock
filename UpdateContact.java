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
public class UpdateContact extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        String updateParameter = req.getParameter("UpdateDropList");

        if (updateParameter.equals("Update E-mail")){RequestDispatcher view = req.getRequestDispatcher("UpdateEmail.jsp");
            view.forward(req, resp);}
        else if (updateParameter.equals("Update Name")){RequestDispatcher view = req.getRequestDispatcher("UpdateName.jsp");
            view.forward(req, resp);}
        else if (updateParameter.equals("Update Number")){RequestDispatcher view = req.getRequestDispatcher("UpdateNumber.jsp");
            view.forward(req, resp);}

    }
}
