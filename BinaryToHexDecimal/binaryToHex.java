package BinaryToHexDecimal;

import java.util.Scanner;

public class binaryToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binaryString = sc.next();
        int decimal = 0;
        StringBuilder hex = new StringBuilder();
        long power = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
            if (i == 0 || power == 4) {
                switch (decimal) {
                    case 10:
                        hex.insert(0, 'A');
                        break;
                    case 11:
                        hex.insert(0, 'B');
                        break;
                    case 12:
                        hex.insert(0, 'C');
                        break;
                    case 13:
                        hex.insert(0, 'D');
                        break;
                    case 14:
                        hex.insert(0, 'E');
                        break;
                    case 15:
                        hex.insert(0, 'F');
                        break;
                    default:
                        hex.insert(0, decimal);
                }
                power = 0;
                decimal = 0;
            }
        }
        System.out.println(hex);
    }
}
