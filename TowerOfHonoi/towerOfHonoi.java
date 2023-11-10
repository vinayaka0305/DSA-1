import java.util.Scanner;

class towerOfHonoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findTowerOfHonoi(n, 'A', 'B', 'C');
    }

    public static void findTowerOfHonoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println(n + ":" + A + "->" + C);
            return;
        }
        findTowerOfHonoi(n - 1, A, C, B);
        System.out.println(n + ":" + A + "->" + C);
        findTowerOfHonoi(n - 1, B, A, C);
    }

}