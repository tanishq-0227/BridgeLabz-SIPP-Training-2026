import java.util.Scanner;

class FizzBuzzGame {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a positive integer: ");
      int limit = sc.nextInt();
      
      if (limit <= 0) {
         System.err.println("Error: Must be a positive integer.");
         System.exit(0);
      }
      
      String[] output = new String[limit + 1];
      
      for (int i = 0; i <= limit; i++) {
         if (i % 3 == 0 && i % 5 == 0) {
            output[i] = "FizzBuzz";
         } else if (i % 3 == 0) {
            output[i] = "Fizz";
         } else if (i % 5 == 0) {
            output[i] = "Buzz";
         } else {
            output[i] = String.valueOf(i);
         }
      }
      
      System.out.println();
      
      for (int i = 0; i < output.length; i++) {
         System.out.println("Index " + i + " -> " + output[i]);
      }
      
      sc.close();
   }
}
