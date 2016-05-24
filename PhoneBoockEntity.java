package one;

/**
 * Created by rysja on 23.05.16.
 */
public class PhoneBoockEntity {
    private String name;
   private int phoneNumber;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

}
