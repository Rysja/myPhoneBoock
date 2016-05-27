package Phone_boock2;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by rysja on 23.05.16.
 */
public class RunPhoneBoockNew {
    public static void main(String[] args) throws IOException,SQLException {

        PhoneBookServiceNew start = new PhoneBookServiceNew();
        start.run();
    }
}
