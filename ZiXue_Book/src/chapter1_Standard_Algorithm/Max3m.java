package chapter1_Standard_Algorithm;

public class Max3m {

    static int max3(int a, int b, int c){
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000000; i++) {
            int a = (int)(Math.random()*3)+1;
            int b = (int)(Math.random()*3)+1;
            int c = (int)(Math.random()*3)+1;
            int max = max3(a,b,c);
            System.out.println(a+"/"+b+"/"+c+"::::"+max);
        }
    }
}
