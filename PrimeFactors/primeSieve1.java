package PrimeFactors;

public class primeSieve1 {
    public static void main(String[] args) {
        int n = 100;
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        int squrt = (int) Math.sqrt(n);

        for (int i = 2; i <= squrt; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
