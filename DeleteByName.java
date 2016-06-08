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
public class DeleteByName extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        Connection connection = new ConnectToDatabase().getConnectionToDB();
        PhoneService phoneService = new PhoneService();


        phoneService.deleteName(connection, name);

        new ConnectToDatabase().closeConnectionToDB();


        resp.sendRedirect("MainPage.html");
    }
}
