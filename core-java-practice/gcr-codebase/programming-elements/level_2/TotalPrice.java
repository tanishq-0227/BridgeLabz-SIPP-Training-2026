import java.util.Scanner;

class TotalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter unit price: ");
        double pricePerUnit = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int itemCount = scanner.nextInt();
        
        double totalCost = pricePerUnit * itemCount;
        
        System.out.println("The total purchase price is INR " + totalCost + " if the quantity " + itemCount + " and unit price is INR " + pricePerUnit);
        
        scanner.close();
    }
}
