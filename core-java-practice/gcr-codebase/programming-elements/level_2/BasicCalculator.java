import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number1: ");
        double firstNumber = scanner.nextDouble();
        
        System.out.print("Enter number2: ");
        double secondNumber = scanner.nextDouble();
        
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
        
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + firstNumber + " and " + secondNumber + " is " + sum + ", " + difference + ", " + product + ", and " + quotient);
        
        scanner.close();
    }
}
