package SearchInCircularArray;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        int res = modfiedBinarySearch(arr, tar, 0, n - 1);
        if (res == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index " + res);
        }
    }

    public static int modfiedBinarySearch(int[] arr, int tar, int left, int right) {
        if (left > right)
            return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == tar) {
            return mid;
        }

        // half left is sorted
        if (arr[mid] >= arr[left]) {
            if (arr[left] <= tar && tar <= arr[mid]) {
                return modfiedBinarySearch(arr, tar, left, mid - 1);
            } else {
                return modfiedBinarySearch(arr, tar, mid + 1, right);
            }
        } else {
            // half right is sorted
            if (arr[mid] <= tar && tar <= arr[right]) {
                return modfiedBinarySearch(arr, tar, mid + 1, right);
            } else {
                return modfiedBinarySearch(arr, tar, left, mid - 1);
            }
        }
    }
}
