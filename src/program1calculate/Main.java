package program1calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String again;
        Boolean yorn = true;
        //Scanner declaration to read input from console
        Scanner scanner = new Scanner(System.in);
        while (yorn){
            System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Please enter one of the symbol +,-,*,/");
        char symbol = scanner.next().charAt(0);
        //object creation
        Calculator obj = new Calculator();
        obj.calculateResult(a,b,symbol);
        System.out.println("Would you like to do more calculation please enter 'Y' or 'N'");
        again = scanner.nextLine();//storing user input Y
        again = scanner.nextLine();//storing user input N
       if (again.equalsIgnoreCase("Y")){
           yorn = true;
       }if (again.equalsIgnoreCase("N")){
           //yorn = false;
                System.out.println("Thank you for using My Calculator");
                System.exit(0);
                scanner.close();
            }
        }
    }
}
