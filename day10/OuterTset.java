import java.util.Scanner;

public class OuterTset {
    public static void main(String[] args) {
        Outer.Inner oi=new Outer().new Inner();
        oi.show();
        Scanner sc=new Scanner(System.in);
        sc.next();
    }
}
