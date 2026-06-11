import java.util.Scanner;

class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Number: ");
        long n = s.nextLong();

        if (n < 0) {
            System.out.println("Only positive numbers work.");
            System.exit(0);
        }

        if (n == 0) {
            System.out.println("0 only. Largest = 0, Second = 0");
            s.close();
            return;
        }

        int limit = 10;
        int[] arr = new int[limit];
        int idx = 0;
        long tmp = n;

        while (tmp != 0) {
            if (idx >= limit) {
                System.out.println("Only first " + limit + " digits used.");
                break;
            }
            arr[idx] = (int)(tmp % 10);
            tmp /= 10;
            idx++;
        }

        int total = idx;
        System.out.print("Digits found: ");
        for (int i = 0; i < total; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        int max = 0, max2 = 0;
        for (int i = 0; i < total; i++) {
            int v = arr[i];
            if (v > max) {
                max2 = max;
                max = v;
            } else if (v > max2 && v != max) {
                max2 = v;
            }
        }

        System.out.println("Max digit: " + max);
        System.out.println("Second max: " + max2);

        s.close();
    }
}
