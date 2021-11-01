package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        char ch;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter First number: ");
            int a = scanner.nextInt();
            System.out.print("Enter Second number: ");
            int b = scanner.nextInt();

            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Please enter one of symbol +,-,*,/: ");
            String str = scanner1.nextLine();

            char symbol = str.charAt(0); // Converting string to char

            calculator.calculateResult(a, b, symbol);
            System.out.print("Would you like to do more calculation please enter \"Y\" or \"N\": ");
            String str1 = scanner1.nextLine();
            ch = str1.charAt(0);

        } while (ch == 'Y' || ch == 'y');
    }


}
