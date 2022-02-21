import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to Calculator!");
        System.out.println("Here are some example commands and their results:");
        System.out.println("add 1 3  --> Output: 4");
        System.out.println("subtract 5 2  --> Output: 3");
        System.out.println("multiply 8 3  --> Output: 24");
        System.out.println("divide 15 3  --> Output: 5");
        System.out.println("fib 6  --> Output: 8");
        System.out.println("binary 8  --> Output: 1000");
        System.out.println("stop  --> Ends the program");

        System.out.println("Enter a command:");

        boolean isRunning = true;

        while(isRunning) {
            String keyword = scanner.next();

            if (keyword.equals("add")) {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println(calculator.add(num1, num2));
            } else if (keyword.equals("subtract")) {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println(calculator.subtract(num1, num2));
            } else if (keyword.equals("multiply")) {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println(calculator.multiply(num1, num2));
            } else if (keyword.equals("divide")) {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println(calculator.divide(num1, num2));
            } else if (keyword.equals("fib")) {
                int num1 = scanner.nextInt();
                System.out.println(calculator.fibonacciNumberFinder(num1));
            } else if (keyword.equals("binary")) {
                int num1 = scanner.nextInt();
                System.out.println(calculator.intToBinaryNumber(num1));
            } else if (keyword.equals("stop")) {
                isRunning = false;
            } else {
                System.out.println("Could not recognize input. Try one of the following keywords: add, subtract, multiply, divide, fib, binary, or stop.");
            }
        }
    }
}
