import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n * 2];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr[n + i] = arr[i];
        }
        if (isIncreasing(arr, n) || isDcreasing(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isIncreasing(int[] arr, int n) {
        int index = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return false;

        for (int i = index + 1; i < n + index; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDcreasing(int[] arr, int n) {
        int index = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return false;

        for (int i = index + 1; i < n + index; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
