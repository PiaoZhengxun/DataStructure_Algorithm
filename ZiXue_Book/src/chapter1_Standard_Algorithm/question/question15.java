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

    //    static void triangleLB(int n) {
//        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
//            for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
//                System.out.print('*');
//            System.out.println(); 					// 개행(줄변환)
//        }
//    }

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

    //    // 왼쪽 위가 직각인 이등변삼각형을 출력
//    static void triangleLU(int n) {
//        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
//            for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
//                System.out.print('*');
//            System.out.println(); 					// 개행(줄변환)
//        }
//    }

    static void triangleRU(int n) {
        System.out.println("RU");
        int a = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = a; j > 0; j--) {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
        System.out.println();
    }

    //    // 오른쪽 위가 직각인 이등변삼각형을 출력
//    static void triangleRU(int n) {
//        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
//            for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
//                System.out.print(' ');
//            for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
//                System.out.print('*');
//            System.out.println();					// 개행(줄변환)
//        }
//    }

    static void triangleRB(int n) {
        System.out.println("RB");
        int a = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = a; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
    }
    //    // 오른쪽 아래가 직각인 이등변삼각형을 출력
//    static void triangleRB(int n) {
//        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,ln)
//            for (int j = 1; j <= n - i; j++) 		// n-i개의 ' '를 나타냄
//                System.out.print(' ');
//            for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
//                System.out.print('*');
//            System.out.println(); 					// 개행(줄변환)
//        }
//    }

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
        triangleRB(n);
    }
}
