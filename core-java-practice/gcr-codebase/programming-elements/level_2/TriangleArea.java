import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base in cm: ");
        double triangleBase = scanner.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double triangleHeight = scanner.nextDouble();
        
        double areaCm2 = 0.5 * triangleBase * triangleHeight;
        double areaIn2 = areaCm2 / (2.54 * 2.54);
        
        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);
        
        scanner.close();
    }
}
