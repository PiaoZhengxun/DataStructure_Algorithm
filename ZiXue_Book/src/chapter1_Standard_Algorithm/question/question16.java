package chapter1_Standard_Algorithm.question;

import java.util.Scanner;

public class question16 {

    static void spira(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();

        spira(n);
    }
}
