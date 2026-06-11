import java.util.Scanner;

class BMICalculator2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int people = 0;
        while (people < 1) {
            System.out.print("Number of people: ");
            people = in.nextInt();
            if (people < 1) System.out.println("Must be > 0.");
        }

        double[][] data = new double[people][3];
        String[] cat = new String[people];

        int W = 0, H = 1, B = 2;

        for (int i = 0; i < people; i++) {
            System.out.println("\nPerson " + (i + 1));
            do {
                System.out.print("  Weight (kg): ");
                data[i][W] = in.nextDouble();
                if (data[i][W] <= 0) System.out.println("Invalid.");
            } while (data[i][W] <= 0);
            do {
                System.out.print("  Height (m): ");
                data[i][H] = in.nextDouble();
                if (data[i][H] <= 0) System.out.println("Invalid.");
            } while (data[i][H] <= 0);
        }

        for (int i = 0; i < people; i++) {
            data[i][B] = data[i][W] / (data[i][H] * data[i][H]);
            double b = data[i][B];
            if (b <= 18.4) cat[i] = "Under";
            else if (b <= 24.9) cat[i] = "Normal";
            else if (b <= 39.9) cat[i] = "Over";
            else cat[i] = "Obese";
        }

        System.out.println("\n-- BMI Table --");
        System.out.printf("%-6s %-8s %-8s %-7s %-8s%n", "ID", "Wt(kg)", "Ht(m)", "BMI", "Type");
        System.out.println("------------------------------");
        for (int i = 0; i < people; i++) {
            System.out.printf("%-6d %-8.1f %-8.2f %-7.1f %-8s%n",
                i + 1, data[i][W], data[i][H], data[i][B], cat[i]);
        }

        in.close();
    }
}
