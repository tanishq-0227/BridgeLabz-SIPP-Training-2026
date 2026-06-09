import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter perimeter of the square: ");
        double perim = scanner.nextDouble();
        
        double sideLength = perim / 4;
        
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perim);
        
        scanner.close();
    }
}
