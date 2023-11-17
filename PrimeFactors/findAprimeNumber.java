package PrimeFactors;

public class findAprimeNumber {
    public static void main(String[] args) {
        int n = 9;
        boolean prime = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        if (prime) {// prime == true
            System.out.println("Yes " + n + " is primeNumber");
        } else {
            System.out.println("No " + n + " it is not a primeNumber");
        }
    }
}
