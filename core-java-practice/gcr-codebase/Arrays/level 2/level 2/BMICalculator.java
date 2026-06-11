import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int count = 0;
        do {
            System.out.print("Persons to enter: ");
            count = console.nextInt();
            if (count < 1) System.out.println("Needs to be 1 or more.");
        } while (count < 1);

        double[] w = new double[count];
        double[] h = new double[count];
        double[] bmiVal = new double[count];
        String[] status = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEntry " + (i + 1));
            while (true) {
                System.out.print("  Weight (kg): ");
                w[i] = console.nextDouble();
                if (w[i] > 0) break;
                System.out.println("Needs to be > 0.");
            }
            while (true) {
                System.out.print("  Height (m): ");
                h[i] = console.nextDouble();
                if (h[i] > 0) break;
                System.out.println("Needs to be > 0.");
            }
            bmiVal[i] = w[i] / (h[i] * h[i]);
            double x = bmiVal[i];
            if (x <= 18.4) status[i] = "Underweight";
            else if (x <= 24.9) status[i] = "Normal";
            else if (x <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\n-- Summary --");
        System.out.println("ID  Weight  Height  BMI    Category");
        System.out.println("-----------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-4d %-7.1f %-7.2f %-6.1f %s%n",
                i + 1, w[i], h[i], bmiVal[i], status[i]);
        }

        console.close();
    }
}
