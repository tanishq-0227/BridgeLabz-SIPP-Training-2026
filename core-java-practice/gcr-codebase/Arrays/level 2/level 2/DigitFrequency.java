import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Give a number: ");
        long val = kb.nextLong();

        if (val < 0) {
            System.out.println("Only non-negative allowed.");
            System.exit(0);
        }

        if (val == 0) {
            System.out.println("0 shows up 1 time.");
            kb.close();
            return;
        }

        String str = Long.toString(val);
        int len = str.length();

        int[] store = new int[len];
        for (int idx = 0; idx < len; idx++) {
            store[idx] = str.charAt(idx) - '0';
        }

        System.out.print("Digits : ");
        for (int x : store) System.out.print(x);
        System.out.println();

        int[] freq = new int[10];
        for (int d : store) freq[d]++;

        System.out.println("\n-- Frequency --");
        System.out.println("Digit | Count");
        System.out.println("--------------");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println("  " + i + "   |  " + freq[i]);
        }

        kb.close();
    }
}
