import java.util.Scanner;

class LargestSecondLargestDynamic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        long value = scan.nextLong();

        if (value < 0) {
            System.out.println("No negatives.");
            System.exit(0);
        }

        if (value == 0) {
            System.out.println("Only digit: 0. Max: 0, Second: 0");
            scan.close();
            return;
        }

        int cap = 5;
        int[] bucket = new int[cap];
        int pos = 0;
        long work = value;

        while (work != 0) {
            if (pos == cap) {
                cap += 5;
                int[] bigger = new int[cap];
                for (int i = 0; i < bucket.length; i++)
                    bigger[i] = bucket[i];
                bucket = bigger;
                System.out.println("Resized to " + cap);
            }
            bucket[pos] = (int)(work % 10);
            work /= 10;
            pos++;
        }

        int totalDigits = pos;

        System.out.print("Digits: ");
        for (int i = 0; i < totalDigits; i++)
            System.out.print(bucket[i] + " ");
        System.out.println("\nCount: " + totalDigits);

        int first = 0, second = 0;
        for (int i = 0; i < totalDigits; i++) {
            int cur = bucket[i];
            if (cur > first) {
                second = first;
                first = cur;
            } else if (cur > second && cur != first) {
                second = cur;
            }
        }

        System.out.println("Biggest: " + first);
        System.out.println("Second biggest: " + second);

        scan.close();
    }
}
