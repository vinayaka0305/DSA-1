package MinCutTree;

import java.util.Scanner;

public class miniCutTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = 100000;
        long ans = 0;
        long units = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            units = cutAtHeight(arr, mid);
            if (units <= k) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static long cutAtHeight(int[] arr, int x) {
        long units = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                units += (arr[i] - x);
            }
        }
        return units;
    }
}
