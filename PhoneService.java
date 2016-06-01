package ff;

import javax.servlet.http.HttpServlet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by rysja on 01.06.16.
 */
public class PhoneService {
    public static Connection con = null;
    public static String username = "root";
    public static String password = "4511426k";
    public static String URL = "jdbc:mysql://127.0.0.1:3306/phone_boock";


    public void add(String c)  {


        String sql = "INSERT INTO phon_list(phon_name, phon_number) values ('"+c+"',45454 );";


        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("root", "4511426k","jdbc:mysql://127.0.0.1:3306/phone_boock");
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
}
