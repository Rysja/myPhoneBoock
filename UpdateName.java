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
public class UpdateName extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String id = req.getParameter("id");
        String newName = req.getParameter("new name");

        Connection connection = new ConnectToDatabase().getConnectionToDB();
        PhoneService phoneService = new PhoneService();

        phoneService.updateName(connection, id,newName );
        new ConnectToDatabase().closeConnectionToDB();

        resp.sendRedirect("MainPage.html");
    }
}