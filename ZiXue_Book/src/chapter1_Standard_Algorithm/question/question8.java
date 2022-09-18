package chapter1_Standard_Algorithm.question;

import java.util.Scanner;

public class question8 {

    public static void main(String[] args) {

        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("--in :");
        n = scanner.nextInt();

        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }

        System.out.println(sum);

        int gaus = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
        System.out.println(gaus);
    }
}
