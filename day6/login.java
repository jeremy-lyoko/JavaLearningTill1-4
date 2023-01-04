import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String rightUserName = "123";
        String rightPassword = "@qweeasd";
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号:");
            String userName = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if (userName.equals(rightUserName) && password.equals(rightPassword)) {
                System.out.println("登陆成功");
                break;
            } else if (i == 2) {
                System.out.println("登录失败,账号被锁定");
            } else {
                System.out.println("登录失败,您还剩下" + (2 - i) + "次机会");
            }

        }
    }
}

