import java.util.Scanner;

class MaximumHandshakesCalculator {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudentsA = inputA.nextInt();
        int maximumHandshakesA = numberOfStudentsA * (numberOfStudentsA - 1) / 2;

        System.out.println("The maximum number of possible handshakes among " + numberOfStudentsA + " students is " + maximumHandshakesA);
    }
}
