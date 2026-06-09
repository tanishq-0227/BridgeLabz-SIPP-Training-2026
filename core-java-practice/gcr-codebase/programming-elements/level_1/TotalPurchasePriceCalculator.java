import java.util.Scanner;

class TotalPurchasePriceCalculator {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter the unit price of the item: ");
        double unitPriceA = inputA.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        int quantityA = inputA.nextInt();
        double totalPriceA = unitPriceA * quantityA;

        System.out.println("The total purchase price is INR " + totalPriceA + " if the quantity " + quantityA + " and unit price is INR " + unitPriceA);
    }
}
