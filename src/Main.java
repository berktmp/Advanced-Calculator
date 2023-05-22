import java.util.Scanner;

// Advanced Calculator
public class Main {
    
    // Addition operation
    static void plus() {
        int result = 0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to add? ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number: ");
            num = scan.nextInt();
            result += num;
        }
        System.out.println("Total: " + result);
    }

    // Subtraction operation
    static void minus() {
        int result = 0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to subtract? ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number: ");
            num = scan.nextInt();
            if (i == 1) {
                result += num;
                continue;
            }
            result -= num;
        }
        System.out.println("Result: " + result);
    }

    // Multiplication operation
    static void multiply() {
        int result = 1, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to multiply? ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number: ");
            num = scan.nextInt();
            if (num == 0) {
                result = 0;
                break;
            }
            result *= num;
        }
        System.out.println("Result: " + result);
    }

    // Division operation
    static void divide() {
        double result = 0.0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to divide? ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number: ");
            num = scan.nextInt();
            if (i != 1 && num == 0) {
                System.out.println("You cannot enter 0 as a divisor.");
                continue;
            }
            if (i == 1) {
                result = num;
                continue;
            }
            result /= num;
        }
        System.out.println("Result: " + result);
    }

    // Power operation
    static void power() {
        int base, power, result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        base = scan.nextInt();
        System.out.print("Enter the exponent value: ");
        power = scan.nextInt();
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }

    // Factorial operation
    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for factorial calculation: ");
        int num = input.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }

    // Modulus operation
    static void mod() {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for modulus calculation: ");
        int num = input.nextInt();
        System.out.print("Enter the number to take modulus with: ");
        int modNum = input.nextInt();
        if (num == 0 && modNum == 0) {
            System.out.println("Please enter valid values.");
        } else {
            result = num % modNum;
            System.out.println("Result: " + result);
        }
    }

    // Rectangle area and perimeter calculation
    static void rectangle() {
        int length, width, perimeter, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = input.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextInt();

        perimeter = (length * 2) + (width * 2);
        area = length * width;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("-------------------------");
        String menu = "1-Addition\n" +
                "2-Subtraction\n" +
                "3-Multiplication\n" +
                "4-Division\n" +
                "5-Power\n" +
                "6-Factorial\n" +
                "7-Modulus\n" +
                "8-Rectangle Area and Perimeter\n" +
                "0-Exit\n";

        do {
            System.out.println("--------------------------");
            System.out.print(menu);
            System.out.println("--------------------------");
            System.out.println("----- CALCULATOR -----");
            System.out.println("--------------------------");
            System.out.print("Choose the operation you want to perform: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Please enter a valid choice!");
            }
        } while (choice != 0);
    }
}
