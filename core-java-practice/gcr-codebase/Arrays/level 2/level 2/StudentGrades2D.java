import java.util.Scanner;

class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] subs = {"Physics", "Chemistry", "Maths"};
        int maxScore = 100;
        int subCount = subs.length;

        int total = 0;
        while (total <= 0) {
            System.out.print("How many students? ");
            total = scan.nextInt();
            if (total <= 0) System.out.println("Need > 0.");
        }

        int[][] scores = new int[total][subCount];
        double[] avg = new double[total];
        String[] letter = new String[total];

        int possible = subCount * maxScore;

        for (int s = 0; s < total; s++) {
            System.out.println("\nStudent " + (s + 1));
            int sum = 0;
            for (int sub = 0; sub < subCount; sub++) {
                while (true) {
                    System.out.print("  " + subs[sub] + ": ");
                    scores[s][sub] = scan.nextInt();
                    if (scores[s][sub] >= 0 && scores[s][sub] <= maxScore) break;
                    System.out.println("Range 0-" + maxScore);
                }
                sum += scores[s][sub];
            }
            double pct = (sum * 100.0) / possible;
            avg[s] = pct;
            if (pct >= 80) letter[s] = "A";
            else if (pct >= 70) letter[s] = "B";
            else if (pct >= 60) letter[s] = "C";
            else if (pct >= 50) letter[s] = "D";
            else if (pct >= 40) letter[s] = "E";
            else letter[s] = "R";
        }

        System.out.println("\n-- Marksheet --");
        String hdr = String.format("%-8s %-8s %-9s %-6s %-8s %-5s", "Roll", "Phy", "Chem", "Math", "Avg", "Gr");
        System.out.println(hdr);
        System.out.println("----------------------------------------");
        for (int s = 0; s < total; s++) {
            System.out.printf("%-8d %-8d %-9d %-6d %-8.1f %-5s%n",
                s + 1, scores[s][0], scores[s][1], scores[s][2], avg[s], letter[s]);
        }

        scan.close();
    }
}
