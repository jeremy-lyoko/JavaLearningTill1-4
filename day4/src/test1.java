import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //输入机票原价、月份、头等舱经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价");
        int ticket = sc.nextInt();
        System.out.println("输入月份");
        int month = sc.nextInt();
        System.out.println("输入舱位 0头等舱，1经济舱");
        int seat = sc.nextInt();

        switch (month) {
            case 1, 2, 3, 4, 11, 12 -> {
                if (seat == 0) {
                    ticket = (int) (ticket * 0.9);
                } else if (seat == 1) {
                    ticket = (int) (ticket * 0.85);
                }
            }
            case 5, 6, 7, 8, 9, 10 -> {
                if (seat == 0) {
                    ticket = (int) (ticket * 0.7);
                } else if (seat == 1) {
                    ticket = (int) (ticket * 0.65);
                }
            }
            default -> System.out.println("月份错误");
        }
        System.out.println("票价"+ticket);

    }
}
