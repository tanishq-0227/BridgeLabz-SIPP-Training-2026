import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double firstNum = scanner.nextDouble();
        
        System.out.print("Enter b: ");
        double secondNum = scanner.nextDouble();
        
        System.out.print("Enter c: ");
        double thirdNum = scanner.nextDouble();
        
        double op1Result = firstNum + secondNum * thirdNum;
        double op2Result = firstNum * secondNum + thirdNum;
        double op3Result = thirdNum + firstNum / secondNum;
        double op4Result = firstNum % secondNum + thirdNum;
        
        System.out.println("The results of Double Operations are " + op1Result + ", " + op2Result + ", " + op3Result + ", and " + op4Result);
        
        scanner.close();
    }
}
