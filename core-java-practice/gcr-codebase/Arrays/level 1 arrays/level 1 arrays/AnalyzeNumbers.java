import java.util.Scanner;

class AnalyzeNumbers {
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      final int LIMIT = 5;
      int[] values = new int[LIMIT];
      
      System.out.println("Input " + LIMIT + " integers:");
      for (int pos = 0; pos < values.length; pos++) {
         System.out.print("Integer " + (pos + 1) + ": ");
         values[pos] = reader.nextInt();
      }
      
      System.out.println();
      
      for (int pos = 0; pos < values.length; pos++) {
         int num = values[pos];
         if (num > 0) {
            if (num % 2 == 0) {
               System.out.println(num + " is positive & even.");
            } else {
               System.out.println(num + " is positive & odd.");
            }
         } else if (num < 0) {
            System.out.println(num + " is negative.");
         } else {
            System.out.println(num + " is zero.");
         }
      }
      
      System.out.println();
      
      int firstVal = values[0];
      int lastVal = values[values.length - 1];
      
      System.out.print("First element " + firstVal + " is ");
      if (firstVal == lastVal) {
         System.out.println("equal to last element " + lastVal + ".");
      } else if (firstVal > lastVal) {
         System.out.println("greater than last element " + lastVal + ".");
      } else {
         System.out.println("less than last element " + lastVal + ".");
      }
      
      reader.close();
   }
}
