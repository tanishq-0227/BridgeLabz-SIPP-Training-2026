import java.util.Scanner;

class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double baseA = inputA.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightA = inputA.nextDouble();
        double areaInSquareInchesA = 0.5 * baseA * heightA;
        double squareInchesToSquareCmA = 6.4516;
        double areaInSquareCmA = areaInSquareInchesA * squareInchesToSquareCmA;

        System.out.println("The area of the triangle with base " + baseA + " inches and height " + heightA + " inches is " + areaInSquareInchesA + " square inches and " + areaInSquareCmA + " square centimeters");
    }
}
