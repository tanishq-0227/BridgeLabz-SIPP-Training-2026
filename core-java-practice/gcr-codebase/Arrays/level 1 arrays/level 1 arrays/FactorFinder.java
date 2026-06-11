import java.util.Scanner;

class FactorFinder {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter number to find its factors: ");
      int num = sc.nextInt();
      
      if (num <= 0) {
         System.err.println("Error: Only positive numbers allowed.");
         System.exit(0);
      }
      
      int capacity = 10;
      int[] factorList = new int[capacity];
      int count = 0;
      
      for (int i = 1; i <= num; i++) {
         if (num % i == 0) {
            if (count == capacity) {
               capacity *= 2;
               int[] bigger = new int[capacity];
               for (int j = 0; j < factorList.length; j++) {
                  bigger[j] = factorList[j];
               }
               factorList = bigger;
            }
            factorList[count] = i;
            count++;
         }
      }
      
      System.out.print("Factors of " + num + ": ");
      for (int i = 0; i < count; i++) {
         System.out.print(factorList[i] + " ");
      }
      System.out.println();
      
      sc.close();
   }
}
