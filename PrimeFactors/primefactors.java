package PrimeFactors;

public class primefactors {
    public static void main(String[] args) {
        int n = 17;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }
}

// timeComplexituy is O(n)
