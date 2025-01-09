import javax.smartcardio.Card;

public class object1 {
    public static void main(String[] args){

        object myCar1 = new object();
        object myCar2 = new object();

        System.out.println(myCar2.model);
        System.out.println(myCar1.make);

        myCar2.drive();
        myCar1.brake();
    }
}
