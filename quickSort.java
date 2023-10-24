public class quickSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 10, 7, 8, 9, 6, 5 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndx = getPivotIndx(arr, left, right);
            quickSort(arr, left, pivotIndx - 1);
            quickSort(arr, pivotIndx + 1, right);
        }
    }

    public static int getPivotIndx(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[right];
        arr[right] = arr[i];
        arr[i] = temp;
        return i;
    }
}