package WebPhoneBoock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by rysja on 02.06.16.
 */
public class ConnectToDatabase {

    public static Connection connection = null;
    public static String username = "root";
    public static String password = "4511426k";
    public static String URL = "jdbc:mysql://127.0.0.1:3306/phone_boock";

    public Connection getConnectionToDB() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, username, password);

        } catch (ClassNotFoundException cnfExp) {
            System.out.println("class was not found");
        } catch (SQLException sqlex) {
            System.out.println("Can't connect to the database, please check parameters");
        }
        return connection;
    }

    public void closeConnectionToDB() {

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
