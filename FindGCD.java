public class FindGCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 33;

        // while (b != 0) {
        // int remainder = a % b;
        // a = b;
        // b = remainder;
        // }
        System.out.print(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
