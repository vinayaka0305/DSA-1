package swapWithoutUsingNewVar;

import java.util.*;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}
