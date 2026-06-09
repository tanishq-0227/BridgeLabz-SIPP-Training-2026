import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1A = inputA.nextDouble();
        System.out.print("Enter second number: ");
        double number2A = inputA.nextDouble();
        double additionResultA = number1A + number2A;
        double subtractionResultA = number1A - number2A;
        double multiplicationResultA = number1A * number2A;
        double divisionResultA = number1A / number2A;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1A + " and " + number2A + " is " + additionResultA + ", " + subtractionResultA + ", " + multiplicationResultA + ", and " + divisionResultA);
    }
}
