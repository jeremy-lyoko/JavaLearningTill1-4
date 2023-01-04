public class method3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printarr(arr);
    }

    //定义方法遍历数组
    //1.我要干什么 遍历
    //2.我需要什么输入 数组
    //3.要不要返回值 不需要
    public static void printarr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
