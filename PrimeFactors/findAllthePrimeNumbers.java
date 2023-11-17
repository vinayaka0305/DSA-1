package PrimeFactors;

public class findAllthePrimeNumbers {
    public static void main(String[] args) {
        int n = 100;
        isPrimeNumber(n);
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
// tc of the code in O(n*sqrt(n));