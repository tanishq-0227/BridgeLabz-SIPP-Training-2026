import java.util.Scanner;

class DistanceConverterFeetToYardsMiles {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeetA = inputA.nextDouble();
        double distanceInYardsA = distanceInFeetA / 3;
        double distanceInMilesA = distanceInYardsA / 1760;

        System.out.println("The distance " + distanceInFeetA + " feet is " + distanceInYardsA + " yards and " + distanceInMilesA + " miles");
    }
}
