public class test4 {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 33, 44},
                {77, 88, 99},
                {1, 2, 3}
        };
        int[][] brr=arr;
        for (int i = 0; i < arr.length; i++) {
            int[] quarterArr = brr[i];
            int sum=getSum(quarterArr);
            System.out.println(i+"季度营业额："+sum);
        }
    }

    //先搞定一维数组求和的方法
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
