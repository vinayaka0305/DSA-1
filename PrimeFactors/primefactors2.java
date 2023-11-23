package PrimeFactors;

public class primefactors2 {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }
}
// all numbers are either prime or madeofPrimeNumbers
// tc of the code is sqrt(n);

// math.sqrt will return double so we are converting it to integer(in line no 6)