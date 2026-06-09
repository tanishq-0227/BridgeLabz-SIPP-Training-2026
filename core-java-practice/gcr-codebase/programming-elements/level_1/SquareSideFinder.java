import java.util.Scanner;

class SquareSideFinder {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeterA = inputA.nextDouble();
        double sideA = perimeterA / 4;

        System.out.println("The length of the side is " + sideA + " whose perimeter is " + perimeterA);
    }
}
