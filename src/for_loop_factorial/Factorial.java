package for_loop_factorial;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// to read input from user
        System.out.println("Enter factorial num");
        int number = scanner.nextInt();

        int factorial =1;
            for(int i=1;i<=number;i++)
            {
                factorial =factorial*i;
            }
            System.out.println("factorial is ->" +factorial);
        }

    }
