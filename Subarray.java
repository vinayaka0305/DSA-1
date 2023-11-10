import java.util.*;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printSubarray(arr, 0, n);
    }

    public static void printSubarray(int[] arr, int i, int n) {
        if (i >= n)
            return;

        for (int j = i; j < n; j++) {
            for (int k = i; k <= j; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        printSubarray(arr, i + 1, n);
    }
}
