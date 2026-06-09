import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int firstNum = scanner.nextInt();
        
        System.out.print("Enter b: ");
        int secondNum = scanner.nextInt();
        
        System.out.print("Enter c: ");
        int thirdNum = scanner.nextInt();
        
        int op1Result = firstNum + secondNum * thirdNum;
        int op2Result = firstNum * secondNum + thirdNum;
        int op3Result = thirdNum + firstNum / secondNum;
        int op4Result = firstNum % secondNum + thirdNum;
        
        System.out.println("The results of Int Operations are " + op1Result + ", " + op2Result + ", " + op3Result + ", and " + op4Result);
        
        scanner.close();
    }
}
