public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 3, 2, 10, 8, 9, 7 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int arr[], int left, int mid, int right) {
        int n = mid - left + 1;
        int m = right - mid;
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[left + i];
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0, k = left;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
