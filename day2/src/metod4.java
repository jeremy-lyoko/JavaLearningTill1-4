public class metod4 {
    //调用方法求最大值
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5};
        System.out.println(getMax(arr));
    }

    public static int getMax(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
