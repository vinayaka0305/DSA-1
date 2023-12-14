public class uniqueElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean unique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}