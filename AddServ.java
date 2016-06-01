package ff;

import ph.PhoneBookServiceNew;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by rysja on 01.06.16.
 */
public class AddServ extends HttpServlet  {
    // @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException  {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String c = req.getParameter("text_box");
        //out.println(c);
        String b = req.getParameter("number_box");
       // out.println(b);
        try {
            PhoneService p = new PhoneService();
            p.add(c);

        }catch (Exception e){e.printStackTrace();}



    }
}
