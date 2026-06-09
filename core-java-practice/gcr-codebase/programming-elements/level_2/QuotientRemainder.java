import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number1: ");
        int dividend = scanner.nextInt();
        
        System.out.print("Enter number2: ");
        int divisor = scanner.nextInt();
        
        int quot = dividend / divisor;
        int rem = dividend % divisor;
        
        System.out.println("The Quotient is " + quot + " and Reminder is " + rem + " of two number " + dividend + " and " + divisor);
        
        scanner.close();
    }
}
