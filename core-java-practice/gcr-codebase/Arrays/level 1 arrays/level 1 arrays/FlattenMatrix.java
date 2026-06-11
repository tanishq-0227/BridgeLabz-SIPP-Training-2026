import java.util.Scanner;

class FlattenMatrix {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Row count: ");
      int r = sc.nextInt();
      
      System.out.print("Column count: ");
      int c = sc.nextInt();
      
      if (r <= 0 || c <= 0) {
         System.err.println("Error: Dimensions must be positive.");
         System.exit(0);
      }
      
      int[][] grid = new int[r][c];
      
      System.out.println("Fill the matrix:");
      for (int row = 0; row < r; row++) {
         for (int col = 0; col < c; col++) {
            System.out.print("Position [" + row + "][" + col + "]: ");
            grid[row][col] = sc.nextInt();
         }
      }
      
      int[] flat = new int[r * c];
      int ptr = 0;
      
      for (int row = 0; row < r; row++) {
         for (int col = 0; col < c; col++) {
            flat[ptr] = grid[row][col];
            ptr++;
         }
      }
      
      System.out.println();
      System.out.println("Matrix:");
      for (int row = 0; row < r; row++) {
         for (int col = 0; col < c; col++) {
            System.out.print(grid[row][col] + " ");
         }
         System.out.println();
      }
      
      System.out.println();
      System.out.print("Flattened array: ");
      for (int i = 0; i < flat.length; i++) {
         System.out.print(flat[i] + " ");
      }
      System.out.println();
      
      sc.close();
   }
}
