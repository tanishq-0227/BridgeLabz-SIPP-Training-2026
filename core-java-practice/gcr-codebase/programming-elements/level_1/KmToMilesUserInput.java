import java.util.Scanner;

class KmToMilesUserInput {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kmA = inputA.nextDouble();
        double kmPerMileA = 1.6;
        double milesA = kmA / kmPerMileA;

        System.out.println("The total miles is " + milesA + " mile for the given " + kmA + " km");
    }
}
