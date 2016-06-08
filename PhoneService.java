package WebPhoneBoock;

import java.sql.*;

/**
 * Created by rysja on 01.06.16.
 */
public class PhoneService {


    public void add(Connection con, String name, String number,String email) {

        String sql = "INSERT INTO phon_list(phon_name, phon_number, email)" + "values ('" + name + "','" + number + "','"+email+"')";

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteNum(Connection con, String phoneNumber) {

        String sql = "DELETE FROM phon_list WHERE phon_number = " + phoneNumber;

        try {

            Statement st = con.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("selected contact was deleted");
    }
    public void deleteId(Connection con, String ids) {

        String sql = "DELETE FROM phon_list WHERE id = "+ids+"";

        try {

            Statement st = con.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("selected contact was deleted");
    }
    public void deleteName(Connection con, String name) {

        String sql = "DELETE FROM phon_list WHERE phon_name = '"+name+"'";

        try {

            Statement st = con.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("selected contact was deleted");
    }

    public void updateNumber(Connection con, String name, String NewNumber) {

        String sql = "UPDATE phon_list SET phon_number = " + NewNumber + " where phon_name ='" + name + "';";

        try {

            Statement st = con.createStatement();
            st.executeUpdate(sql);

        } catch (Exception se) {
            se.printStackTrace();
        }
    }
    public void updateName(Connection con, String id, String NewName) {

        String sql = "UPDATE phon_list SET phon_name = '" + NewName + "' where id =" +id + ";";

        try {

            Statement st = con.createStatement();
            st.executeUpdate(sql);

        } catch (Exception se) {
            se.printStackTrace();
        }
    }
    public void updateEmail(Connection con, String name, String email) {

        String sql = "UPDATE phon_list SET email = '" + email + "' where phon_name ='" + name + "';";

        try {

            Statement st = con.createStatement();
            st.executeUpdate(sql);

        } catch (Exception se) {
            se.printStackTrace();
        }
    }
}
