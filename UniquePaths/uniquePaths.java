package UniquePaths;

import java.util.*;

public class uniquePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        // rows
        for (int i = 0; i < n; i++) {
            arr[m - 1][i] = 1;
        }
        // cols
        for (int i = 0; i < m; i++) {
            arr[i][n - 1] = 1;
        }
        for (int row = m - 2; row >= 0; row--) {
            for (int col = n - 2; col >= 0; col--) {
                arr[row][col] = arr[row + 1][col] + arr[row][col + 1];
            }
        }
        System.out.println(arr[0][0]);
    }
}
