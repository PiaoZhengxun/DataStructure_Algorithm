package chapter1_Standard_Algorithm.question;

import java.util.Scanner;

public class question15 {
    static void triangleLB(int n) {
        System.out.println("LB");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void triangleLU(int n) {
        System.out.println("LU");
        do {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            n--;
        } while (n > 0);
    }

    static void triangleRU(int n){
        int a = n;
        System.out.println("RU");
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            for (int j = a; j > 0; j--) {
                System.out.print("*");
                a--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("in");
            n = scanner.nextInt();
        } while (n <= 0);
        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
    }
}
