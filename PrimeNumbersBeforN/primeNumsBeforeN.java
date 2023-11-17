package PrimeNumbersBeforN;

import java.util.Scanner;

public class primeNumsBeforeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100000;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        int[] count = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count[i] = count[i - 1] + 1;
            } else {
                count[i] = count[i - 1];
            }
        }
        int num = sc.nextInt();
        System.out.print(count[num]);
    }
}
