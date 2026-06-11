import java.util.Scanner;

class TableGenerator {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      final int MIN = 1;
      final int MAX = 10;
      final int RANGE = MAX - MIN + 1;
      
      System.out.print("Enter number for multiplication table: ");
      int num = sc.nextInt();
      int[] tableValues = new int[RANGE];
      
      for (int i = 0; i < tableValues.length; i++) {
         int m = i + 1;
         tableValues[i] = num * m;
      }
      
      System.out.println();
      System.out.println("Table of " + num + ":");
      for (int i = 0; i < tableValues.length; i++) {
         int m = i + 1;
         System.out.println(num + " x " + m + " = " + tableValues[i]);
      }
      
      sc.close();
   }
}
