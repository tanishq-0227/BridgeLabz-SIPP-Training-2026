import java.util.Scanner;

class VoteEligibility {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      final int COUNT = 10;
      int[] ages = new int[COUNT];
      
      System.out.println("Provide ages of " + COUNT + " students:");
      for (int idx = 0; idx < ages.length; idx++) {
         System.out.print("Enter age for student " + (idx + 1) + ": ");
         ages[idx] = sc.nextInt();
      }
      
      System.out.println();
      
      for (int idx = 0; idx < ages.length; idx++) {
         int ageValue = ages[idx];
         if (ageValue < 0) {
            System.out.println("Student " + (idx + 1) + ": Invalid entry.");
         } else if (ageValue >= 18) {
            System.out.println("Student aged " + ageValue + " is eligible to vote.");
         } else {
            System.out.println("Student aged " + ageValue + " is not eligible to vote.");
         }
      }
      
      sc.close();
   }
}
