import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Ravi", "Rohan", "Raj"};
        int fCount = friends.length;

        int[] yrs = new int[fCount];
        double[] cm = new double[fCount];

        System.out.println("-- Age & Height Checker --\n");
        for (int i = 0; i < fCount; i++) {
            System.out.println("Data for " + friends[i]);
            while (true) {
                System.out.print("  Age: ");
                yrs[i] = sc.nextInt();
                if (yrs[i] > 0) break;
                System.out.println("Must be > 0.");
            }
            while (true) {
                System.out.print("  Height (cm): ");
                cm[i] = sc.nextDouble();
                if (cm[i] > 0) break;
                System.out.println("Must be > 0.");
            }
            System.out.println();
        }

        int youngIdx = 0;
        int tallIdx = 0;
        for (int i = 1; i < fCount; i++) {
            if (yrs[i] < yrs[youngIdx]) youngIdx = i;
            if (cm[i] > cm[tallIdx]) tallIdx = i;
        }

        System.out.println("-- Final Report --");
        System.out.println("Youngest -> " + friends[youngIdx] + " (" + yrs[youngIdx] + " years)");
        System.out.println("Tallest  -> " + friends[tallIdx] + " (" + cm[tallIdx] + " cm)");

        sc.close();
    }
}
