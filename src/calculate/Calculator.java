package calculate;

public class Calculator {

    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }

    public void division(int a, int b) {
        System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
    }

    public void multiplicaiton(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
    }

    public void calculateResult(int a, int b, char c) {

        if (c == '+') {
            addition(a, b);
        } else if (c == '-') {
            subtraction(a, b);
        } else if (c == '*') {
            multiplicaiton(a, b);
        } else if (c == '/') {
            division(a, b);
        } else {
            System.out.println("Invalid Symbol");
        }
    }
}
