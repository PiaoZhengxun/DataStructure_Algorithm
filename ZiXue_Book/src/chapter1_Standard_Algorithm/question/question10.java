package chapter1_Standard_Algorithm.question;

import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int a;
        int b;

        do {
            System.out.println("a");
            a = scanner.nextInt();
            System.out.println("b");
            b = scanner.nextInt();
        }while (a<b);

        System.out.println(a-b);
    }
}
