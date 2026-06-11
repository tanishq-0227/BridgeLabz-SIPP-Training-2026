import java.util.Scanner;

class TableRange {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      final int START = 6;
      final int END = 9;
      final int SIZE = END - START + 1;
      
      System.out.print("Enter number for table from 6 to 9: ");
      int num = sc.nextInt();
      int[] results = new int[SIZE];
      
      for (int i = 0; i < results.length; i++) {
         int factor = i + START;
         results[i] = num * factor;
      }
      
      System.out.println();
      System.out.println(num + " table (6 to 9):");
      for (int i = 0; i < results.length; i++) {
         int factor = i + START;
         System.out.println(num + " x " + factor + " = " + results[i]);
      }
      
      sc.close();
   }
}
