package WebPhoneBoock;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

/**
 * Created by rysja on 08.06.16.
 */
public class UpdateEmail extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");

        Connection connection = new ConnectToDatabase().getConnectionToDB();
        PhoneService phoneService = new PhoneService();

        phoneService.updateEmail(connection, name, email);
        new ConnectToDatabase().closeConnectionToDB();

        resp.sendRedirect("MainPage.html");
    }
}