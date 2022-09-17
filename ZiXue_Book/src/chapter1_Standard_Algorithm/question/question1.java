package chapter1_Standard_Algorithm.question;

public class question1 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        return max;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int a = (int)(Math.random()*3)+1;
            int b = (int)(Math.random()*3)+1;
            int c = (int)(Math.random()*3)+1;
            int d = (int)(Math.random()*3)+1;
            int max = max4(a,b,c,d);
            System.out.println(a+"/"+b+"/"+c+"/"+d+"::::"+max);
        }
    }
}
