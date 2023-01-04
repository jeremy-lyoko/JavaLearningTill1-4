import java.util.Scanner;

public class DamageCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = 2 * 0.8 + 15;
        double Percent = 1.34;


        while (true) {
            double increase = sc.nextInt();
            double increase2 = sc.nextDouble();

            double d1 = getDamage(increase, base, Percent);
            System.out.println("加固定伤害" + d1);
            double d2 = getDamage2(increase2, base, Percent);
            System.out.println("加百分比伤害" + d2);
        }


    }

    private static double getDamage2(double increase, double base, double percent) {
        return base * (percent + increase);
    }

    private static double getDamage(double increase, double base, double percent) {
        return (base + increase * 0.8) * percent;
    }
}
