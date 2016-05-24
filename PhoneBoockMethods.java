package one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by rysja on 23.05.16.
 */
public  class PhoneBoockMethods {

    ArrayList<PhoneBoockEntity> save=new ArrayList<>();
    public   void run() throws IOException{

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));







while (true) {
    System.out.println("Select what you want to do:");
    System.out.println("End or Continue");
    String answer =reader.readLine();


    if (answer.equals("continue")) {

        System.out.println("1-add contact, 2-view contact, 3-remove contact");
        int ch = Integer.parseInt(reader.readLine());

         switch (ch) {

             case 1:
                 add(reader);
break;

             case 2:
                 view();
                 break;
             case 3:
                 System.out.println("input ID");
                 remove(Integer.parseInt(reader.readLine()));
                 break;
             default :
                 System.out.println("Please input only from 1 to 3");
         }


    }else if (answer.equals("end")){break;}else {
        System.out.println("You input wrong word");
    }
}

    }



      public void add(BufferedReader reader) throws IOException{
          PhoneBoockEntity add1=new PhoneBoockEntity();


          System.out.println("Input Name");
          add1.setName(reader.readLine());
          System.out.println("Input Phone Number");
          add1.setPhoneNumber(Integer.parseInt(reader.readLine()));
          save.add(add1);


      }
    public void remove(int ID){

        save.remove(ID);
        System.out.println("selected ID was deleted");
    }
    public void  view(){
        for (int i=0;i<save.size();i++) {
            System.out.println(save.get(i).getName() +" "+ save.get(i).getPhoneNumber());

        }
    }

}
