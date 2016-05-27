package Phone_boock2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

/**
 * Created by rysja on 23.05.16.
 */
public class PhoneBookServiceNew {
    private static Connection con = null;
    private static String username = "root";
    private static String password = "4511426k";
    private static String URL = "jdbc:mysql://127.0.0.1:3306/phone_boock";


    public void run() throws IOException, SQLException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            System.out.println("Select what you want to do:");
            System.out.println("End or Continue");
            String answer = reader.readLine();


            if (answer.equals("continue")) {

                System.out.println("1-add contact, 2-view contact, 3-remove contact, 4-update number");
                int number = Integer.parseInt(reader.readLine());

                switch (number) {

                    case 1:
                        add();
                        break;

                    case 2:
                        view();
                        break;
                    case 3:

                        remove();
                        break;
                    case 4:
                        updatePhoneNumber();
                        break;
                    default:
                        System.out.println("Please input only from 1 to 3");
                }


            } else if (answer.equals("end")) {
                break;
            } else {
                System.out.println("You input wrong word");
            }
        }

    }


    public void add() throws IOException, SQLException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input Name");
        String name = reader.readLine();

        System.out.println("Input Phone Number");
        int phoneNumber = Integer.parseInt(reader.readLine());


        String sql = "INSERT INTO phon_list(phon_name, phon_number) values ('" + name + "'," + phoneNumber + ");";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, username, password);
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }


    public void remove() throws IOException, SQLException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Input Phone Number");
        int phoneNumber = Integer.parseInt(reader.readLine());

        String sql = "DELETE FROM phon_list WHERE phon_number = " + phoneNumber;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, username, password);
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        System.out.println("selected ID was deleted");
    }


    public void view() {
        String sql = "SELECT phon_name, phon_number FROM phon_list;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
           /* while (rs.next()) {
                String first = rs.getString("phon_name");
                int age = rs.getInt("phon_number");
                System.out.println(  first + "\t" + age);
            }*/
            dispResultSet(rs);
            rs.close();
            st.close();
            con.close();
        } catch (Exception se) {
            se.printStackTrace();
        }

    }

    private static void dispResultSet(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        int numCols = rsmd.getColumnCount();
        for (int i = 1; i <= numCols; i++) {
            if (i > 1) System.out.print(" ");
            System.out.print("\t\t " + rsmd.getColumnLabel(i));
        }
        System.out.println("");
        for (int nRow = 1; rs.next(); nRow++) {
            for (int i = 1; i <= numCols; i++) {
                if (i == 1)
                    System.out.print(" Row " + nRow + ":");
                else
                    System.out.print("\t\t");

                String s = rs.getString(i);

                System.out.print("\t" + s);
            }
            System.out.println();
        }
    }

    private static void updatePhoneNumber () throws SQLException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Input  name where you want to  update phone number");
        String name = reader.readLine();
        System.out.println("Input new phone number");
        int NewNumber = Integer.parseInt(reader.readLine());


        String sql = "UPDATE phon_list SET phon_number = " + NewNumber + " where phon_name ='" + name + "';";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, username, password);
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
        } catch (Exception se) {
            se.printStackTrace();
        }

    }
}
