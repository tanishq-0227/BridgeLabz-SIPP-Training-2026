import java.util.Scanner;

class AverageHeight {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      final int TEAM_SIZE = 11;
      double[] playerHeights = new double[TEAM_SIZE];
      
      System.out.println("Input heights of " + TEAM_SIZE + " players (cm):");
      for (int i = 0; i < playerHeights.length; i++) {
         System.out.print("Player " + (i + 1) + ": ");
         playerHeights[i] = sc.nextDouble();
      }
      
      double totalHeight = 0.0;
      for (int i = 0; i < playerHeights.length; i++) {
         totalHeight += playerHeights[i];
      }
      
      double avg = totalHeight / TEAM_SIZE;
      
      System.out.println();
      System.out.println("Total height: " + totalHeight + " cm");
      System.out.println("Average height: " + avg + " cm");
      
      sc.close();
   }
}
