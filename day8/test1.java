import java.util.Scanner;

public class test1 {
    //阿拉伯数字转成罗马数字,9位
    public static void main(String[] args) {
        //输入
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            System.out.println("请输入数字");
            String str = sc.next();
            boolean flag = check(str);
            if (flag) {
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    int number = c - 48;
                    String change = change(number);
                    sb.append(change);
                }
                break;
            } else System.out.println("错误,请重新输入");
        }
        System.out.println(sb);
    }

    //数字转罗马,建立罗马数组,索引对应罗马数
    public static String change(int num) {
        String[] arr = {" ", "ⅰ", "ⅱ", "ⅲ", "ⅳ", "ⅴ", "ⅵ", "ⅶ", "ⅷ", "ⅸ"};
        return arr[num];
    }

    //校验
    public static boolean check(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
