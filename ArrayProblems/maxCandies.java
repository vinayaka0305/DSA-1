import java.util.*;

public class maxCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] arr = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[2][n];
        dp[0][0] = arr[0][0];

        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + arr[0][i];
        }
        for (int i = 1; i < 2; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }

        for (int i = 1; i < 2; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
            }
        }
        System.out.println(dp[1][n - 1]);
    }
}
