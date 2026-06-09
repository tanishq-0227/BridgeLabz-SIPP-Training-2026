import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCmA = inputA.nextDouble();
        double cmPerInchA = 2.54;
        double inchesPerFootA = 12;
        double totalInchesA = heightCmA / cmPerInchA;
        int feetA = (int) (totalInchesA / inchesPerFootA);
        double inchesA = totalInchesA % inchesPerFootA;

        System.out.println("Your Height in cm is " + heightCmA + " while in feet is " + feetA + " and inches is " + inchesA);
    }
}
