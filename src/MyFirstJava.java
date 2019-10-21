import java.util.Scanner;

public class MyFirstJava {
    public static void main(String args[]){
        System.out.println("Welcome to my world!");
        System.out.println("My Name Is Rediet.");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String userResponse = keyboard.nextLine();
        System.out.println("Your name is " + userResponse);

        int x, y, z;
        System.out.println("Calculation Filed");

        System.out.println("Enter your a number here");
        x = keyboard.nextInt();

        System.out.println("Enter your second number here");
        y = keyboard.nextInt();

        z= x*y;
        System.out.println("Your result is:" + z);




    }


}