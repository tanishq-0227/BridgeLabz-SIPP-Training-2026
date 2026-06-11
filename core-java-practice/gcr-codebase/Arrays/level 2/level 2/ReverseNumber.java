import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        long num = sc.nextLong();

        if (num < 0) {
            System.out.println("Negative not allowed.");
            System.exit(0);
        }

        if (num == 0) {
            System.out.println("Given : 0");
            System.out.println("Reversed : 0");
            sc.close();
            return;
        }

        long temp = num;
        int size = 0;
        while (temp > 0) {
            size++;
            temp /= 10;
        }

        int[] arr = new int[size];
        temp = num;
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(temp % 10);
            temp /= 10;
        }

        System.out.print("Given number : " + num);
        System.out.println();

        long reversed = 0;
        for (int d : arr) {
            reversed = reversed * 10 + d;
        }
        System.out.println("Reversed     : " + reversed);

        sc.close();
    }
}
