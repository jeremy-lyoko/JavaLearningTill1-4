import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s= sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            System.out.print(c);
        }
    }
}
