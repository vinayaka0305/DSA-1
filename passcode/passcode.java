package passcode;

import java.util.Scanner;

public class passcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mod = 1000000007;
        long ans = 1;

        if (n % 2 == 0) {
            ans = (pow(5, n / 2) % mod * pow(4, n / 2) % mod) % mod;
        } else {
            ans = (pow(5, n / 2) % mod * pow(4, n / 2) % mod) % mod;
            ans = (ans * 5) % mod;
        }
        System.out.print(ans);
    }

    public static long pow(long a, long b) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        }
        long ans = 1;
        long mod = 1000000007;
        long power = pow(a, b / 2);
        if (b % 2 == 0) {
            ans = (power * power) % mod;
        } else {
            ans = ((power * power) % mod * a) % mod;
        }
        return ans;
    }
}
