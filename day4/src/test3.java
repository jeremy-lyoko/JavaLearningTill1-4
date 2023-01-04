public class test3 {
    //找质数并输出
    public static void main(String[] args) {

        int count = 0;
        for (int i = 100; i < 200; i++) {
            boolean flag = true;//flag默认是true，下面的if判断是不是合数
            //是合数则flag变否
            for (int j = 2; j < 100; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i + "是质数");
                count++;
            }
        }
        System.out.println("总数量" + count);
    }
}
