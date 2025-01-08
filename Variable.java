import java.net.StandardSocketOptions;

public class Variable {
    public static void main(String[] args) {
        int age = 21;
        int year = 2025;
        int quantity = 1;

        System.out.println("This Year is " + year);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("To pass an sem exam you should score atleast " + gpa + "gpa");

        char grade = 'A';
        char currency = '$';

        System.out.println(grade);

        boolean isStudent = true;
        boolean isWorking = false;

        if(isWorking){
            System.out.println("You are a student");
        }else{
            System.out.println("You are working");
        }

        String name="Pravi";
        System.out.println(name);

    }
}
