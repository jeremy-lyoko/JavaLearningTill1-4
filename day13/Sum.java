public class Sum {
    public static void main(String[] args) {
        int a = getSum(100);
        System.out.println(a);
    }

    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num = num + getSum(num-1);
    }
}

