package MaxPrimeNumberInRange;

import java.util.Scanner;

public class maxPrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int ans = -1;
        boolean[] isPrime = new boolean[right + 1];
        for (int i = 0; i <= right; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(right); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = right; i >= left; i--) {
            if (isPrime[i]) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
