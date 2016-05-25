/**
 * Created by rysja on 25.05.16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class DemoJDBC {

    private static Connection con = null;
    private static String username = "root";
    private static String password = "4511426k";
    private static String URL = "jdbc:mysql://127.0.0.1:3306/phone_boock";


    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();

        int g=Integer.parseInt(reader.readLine());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, username, password);
            Statement st = con.createStatement();
            String sql="INSERT INTO phon_list(phon_name, phon_number) values (?,?);";


            PreparedStatement prepareStatement = con.prepareStatement(sql);
            prepareStatement.setString(1,s);
            prepareStatement.setInt(2,g);
            prepareStatement.executeUpdate();
            prepareStatement.close();
           // st.executeUpdate(sql);
           // rs.next();
            //String sname = rs.getString(2);
            //rs.close();
            con.close();
        } catch (Exception se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }
    }

}
