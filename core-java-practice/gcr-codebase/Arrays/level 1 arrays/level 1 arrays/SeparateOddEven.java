import java.util.Scanner;

class SeparateOddEven {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a natural number: ");
      int n = sc.nextInt();
      
      if (n <= 0) {
         System.err.println("Error: Input must be positive.");
         System.exit(0);
      }
      
      int[] evens = new int[n / 2 + 1];
      int[] odds = new int[n / 2 + 1];
      int eIdx = 0;
      int oIdx = 0;
      
      for (int val = 1; val <= n; val++) {
         if (val % 2 == 0) {
            evens[eIdx] = val;
            eIdx++;
         } else {
            odds[oIdx] = val;
            oIdx++;
         }
      }
      
      System.out.print("Odd values: ");
      for (int i = 0; i < oIdx; i++) {
         System.out.print(odds[i] + " ");
      }
      System.out.println();
      
      System.out.print("Even values: ");
      for (int i = 0; i < eIdx; i++) {
         System.out.print(evens[i] + " ");
      }
      System.out.println();
      
      sc.close();
   }
}
