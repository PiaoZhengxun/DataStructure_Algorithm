package chapter1_Standard_Algorithm;

import java.util.Scanner;

/*
if the process runs in order then it called 'Concatenation'
if equation changes the running flow then the equation called 'Selection Structure'
 */


public class Max3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("find the highest num");
        System.out.print(" value A : ");
        int a = scanner.nextInt();
        System.out.print(" value B : ");
        int b = scanner.nextInt();
        System.out.print(" value C : ");
        int c = scanner.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Max num is " + max);
    }
}

