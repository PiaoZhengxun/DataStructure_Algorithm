package chapter1_Standard_Algorithm.question;

public class question7 {

    public static void main(String[] args) {

        int sum =0;
        for (int i = 1; i < 8; i++) {
sum+=i;
            if (i!=7){
                System.out.print(i+"+");
            } else {
                System.out.print(i+"=");
            }
        }
        System.out.println(sum);
    }
}
