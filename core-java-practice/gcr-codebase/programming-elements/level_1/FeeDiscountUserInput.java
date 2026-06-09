import java.util.Scanner;

class FeeDiscountUserInput {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter the course fee: ");
        double feeA = inputA.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercentA = inputA.nextDouble();
        double discountA = feeA * discountPercentA / 100;
        double discountedFeeA = feeA - discountA;

        System.out.println("The discount amount is INR " + discountA + " and final discounted fee is INR " + discountedFeeA);
    }
}
