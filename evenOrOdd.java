package FindEvenOroddwithoutModulo;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        int n = 11;
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}