
public class FindAllDivisorsOptimised {
    public static void main(String[] args) {
        int n = 36;
        printAllFactors(n);
    }

    public static void printAllFactors(int n) {
        int squrt = (int) Math.sqrt(n);
        // System.out.println(Math.sqrt(n));
        // System.out.println((int) Math.sqrt(n));
        for (int i = 1; i <= squrt; i++) {
            if (n % i == 0) {
                System.out.print(i + " " + n / i + " ");
            }
        }
    }
}
