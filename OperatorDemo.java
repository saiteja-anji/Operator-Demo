import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\nArithmetic Operators:");
        System.out.println("Sum: " + (num1 + num2));        
        System.out.println("Difference: " + (num1 - num2));   
        System.out.println("Product: " + (num1 * num2));     
        System.out.println("Quotient: " + (num1 / num2));     
        System.out.println("Remainder: " + (num1 % num2));  
       
        System.out.println("\nRelational Operators:");
        System.out.println("num1 == num2: " + (num1 == num2)); 
        System.out.println("num1 != num2: " + (num1 != num2)); 
        System.out.println("num1 > num2: " + (num1 > num2));   
        System.out.println("num1 < num2: " + (num1 < num2));   
        System.out.println("\nLogical Operators:");
        boolean condition1 = (num1 > 10);
        boolean condition2 = (num2 < 20);
        
        System.out.println("num1 > 10 AND num2 < 20: " + (condition1 && condition2)); 
        System.out.println("num1 > 10 OR num2 < 20: " + (condition1 || condition2));  
        System.out.println("NOT (num1 > 10): " + !(num1 > 10));

        
        scanner.close();
    }
}