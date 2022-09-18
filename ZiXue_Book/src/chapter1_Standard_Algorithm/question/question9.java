package chapter1_Standard_Algorithm.question;

import java.awt.print.Printable;
import java.util.Scanner;

public class question9 {

    public static int sumOf(int a, int b) {
        int sum = 0;
        if (a > b) {
            for (int i = b; i < a + 1; i++) {
                sum += i;
            }
        } else if (b > a) {
            for (int i = a; i < b + 1; i++) {
                sum += i;
            }

        } else {
            return a;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("in:");
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int sum=sumOf(a,b);
        System.out.println(sum);
    }
}
