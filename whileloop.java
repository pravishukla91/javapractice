import java.sql.SQLOutput;
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name ="";

        while(name.isEmpty()){
            System.out.println("Enter you name: ");
            name = scanner.nextLine();
        }
        System.out.println("hello "+ name);
        scanner.close();
    }
}
