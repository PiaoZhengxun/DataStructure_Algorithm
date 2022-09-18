package chapter1_Standard_Algorithm.question;

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("in");
            a = scanner.nextInt();
        } while (a < 0);

        int count = 1;
        while (a > 1){
            count++;
            a = a/10;
        }

        System.out.println(count);


    }
}
