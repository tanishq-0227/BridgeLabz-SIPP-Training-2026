import java.util.Scanner;

class ZaraEmployeeBonus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        final int STAFF = 10;
        double[] pay = new double[STAFF];
        double[] tenure = new double[STAFF];
        double[] updated = new double[STAFF];
        double[] extra = new double[STAFF];

        double rewardHi = 0.05;
        double rewardLo = 0.02;
        int cutoff = 5;

        double sumOld = 0, sumBonus = 0, sumNew = 0;

        System.out.println("--- Zara Bonus System ---\n");
        for (int i = 0; i < STAFF; i++) {
            System.out.println("-- Employee " + (i + 1));
            while (true) {
                System.out.print("  Salary: ");
                pay[i] = kb.nextDouble();
                if (pay[i] > 0) break;
                System.out.println("Invalid.");
            }
            while (true) {
                System.out.print("  Years worked: ");
                tenure[i] = kb.nextDouble();
                if (tenure[i] >= 0) break;
                System.out.println("Cannot be negative.");
            }
        }

        System.out.println("\n-- Bonus Details --");
        String title = String.format("%-6s %-10s %-12s %-8s %-10s",
            "Emp#", "Salary", "Service", "Bonus", "NewSal");
        System.out.println(title);
        System.out.println("-----------------------------------------");

        for (int i = 0; i < STAFF; i++) {
            double rate = (tenure[i] > cutoff) ? rewardHi : rewardLo;
            extra[i] = pay[i] * rate;
            updated[i] = pay[i] + extra[i];
            sumOld += pay[i];
            sumBonus += extra[i];
            sumNew += updated[i];
            System.out.printf("%-6d %-10.2f %-12.1f %-8.2f %-10.2f%n",
                i + 1, pay[i], tenure[i], extra[i], updated[i]);
        }

        System.out.println("-----------------------------------------");
        System.out.printf("Total old salary : %.2f%n", sumOld);
        System.out.printf("Bonus payout     : %.2f%n", sumBonus);
        System.out.printf("New salary total : %.2f%n", sumNew);

        kb.close();
    }
}
