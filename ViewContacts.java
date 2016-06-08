package WebPhoneBoock;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by rysja on 02.06.16.
 */
public class ViewContacts extends HttpServlet{

        public void doPost (HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

            resp.sendRedirect("MainPage.html");
        }
}
