import java.util.Scanner;

class CollectAndSum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      final int CAPACITY = 10;
      double[] data = new double[CAPACITY];
      double sumTotal = 0.0;
      int pos = 0;
      
      System.out.println("Enter values (0 or less stops, max " + CAPACITY + " entries):");
      
      while (true) {
         System.out.print("Value " + (pos + 1) + ": ");
         double entry = sc.nextDouble();
         
         if (entry <= 0) {
            System.out.println("Stopping input.");
            break;
         }
         
         if (pos == CAPACITY) {
            System.out.println("Array is full.");
            break;
         }
         
         data[pos] = entry;
         pos++;
      }
      
      System.out.println();
      
      System.out.print("Recorded values: ");
      for (int i = 0; i < pos; i++) {
         System.out.print(data[i] + " ");
      }
      System.out.println();
      
      for (int i = 0; i < pos; i++) {
         sumTotal += data[i];
      }
      
      System.out.println("Total sum: " + sumTotal);
      sc.close();
   }
}
