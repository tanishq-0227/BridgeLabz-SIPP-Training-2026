import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = 0;
        while (n < 1) {
            System.out.print("Number of students: ");
            n = reader.nextInt();
            if (n < 1) System.out.println("Must be positive.");
        }

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        int[] combined = new int[n];
        double[] pc = new double[n];
        String[] grade = new String[n];

        int full = 300;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEntry #" + (i + 1));
            while (true) {
                System.out.print("  Physics: ");
                phy[i] = reader.nextInt();
                if (phy[i] >= 0 && phy[i] <= 100) break;
                System.out.println("0-100 only.");
            }
            while (true) {
                System.out.print("  Chemistry: ");
                chem[i] = reader.nextInt();
                if (chem[i] >= 0 && chem[i] <= 100) break;
                System.out.println("0-100 only.");
            }
            while (true) {
                System.out.print("  Maths: ");
                math[i] = reader.nextInt();
                if (math[i] >= 0 && math[i] <= 100) break;
                System.out.println("0-100 only.");
            }

            combined[i] = phy[i] + chem[i] + math[i];
            double p = (combined[i] * 100.0) / full;
            pc[i] = p;
            if (p >= 80) grade[i] = "A";
            else if (p >= 70) grade[i] = "B";
            else if (p >= 60) grade[i] = "C";
            else if (p >= 50) grade[i] = "D";
            else if (p >= 40) grade[i] = "E";
            else grade[i] = "R";
        }

        System.out.println("\n-- Results --");
        String line = String.format("%-6s %-8s %-10s %-7s %-7s %-9s %-5s",
            "S.No", "Physics", "Chemistry", "Maths", "Total", "Percent", "Gr");
        System.out.println(line);
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-6d %-8d %-10d %-7d %-7d %-9.1f %-5s%n",
                i + 1, phy[i], chem[i], math[i], combined[i], pc[i], grade[i]);
        }

        reader.close();
    }
}
