public class FindLcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 30;

        // while (b != 0) {
        // int remainder = a % b;
        // a = b;
        // b = remainder;
        // }
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
