package chapter1_Standard_Algorithm.question;

import java.util.Scanner;

public class question14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("line in");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
