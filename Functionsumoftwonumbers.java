import java.util.Scanner;
public class Functionsumoftwonumbers {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        scanner.close();
    }
}