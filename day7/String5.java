import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        //输入金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                System.out.println("输入金额为:" + money + "元");
                break;
            } else System.out.println("金额错误");
        }
        //转字符
        String moneyStr="";
        while (true) {
            int ge = money % 10;
            String c=capital(ge);
            moneyStr=c+moneyStr;

            money = money / 10;
            if (money == 0) break;
        }
        System.out.println("转换一:"+moneyStr+"元");
        //补零
        int count=7-moneyStr.length();//计算补零多少位
        for (int i = 0; i < count; i++) {
            moneyStr="零"+moneyStr;
        }
        //插入单位
        //定义数组表示单位
        String[] arr={"佰","拾","万","仟","佰","拾","元",};

        String result="";
        for (int i = 0; i < moneyStr.length(); i++) {

            char c=moneyStr.charAt(i);
           result=result+c+arr[i];
        }
        System.out.print("转换二:"+result);
    }

    public static String capital(int index) {
        String[] arr = {"零", "壹", "贰", "弎", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[index];
    }
}
