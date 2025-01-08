import java.util.Scanner;

public class userInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your gpa");
        double gpa = scanner.nextDouble();

        System.out.println("Hello "+ name );
        System.out.println("Your are "+ age + "years old");
        System.out.println("Your gpa in this sem are " + gpa);
        scanner.close();

    }
}
