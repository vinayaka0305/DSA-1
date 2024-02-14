public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 1, 2, 7 };
        int n = arr.length;
        int res = -1;
        int smallest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[smallest]) {
                res = smallest;
                smallest = i;
            } else if (arr[i] != arr[smallest]) {
                if (res == -1 || arr[i] < arr[res]) {
                    res = i;
                }
            }
        }
        System.out.println(arr[res]);
    }
}
