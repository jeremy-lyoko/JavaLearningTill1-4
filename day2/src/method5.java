public class method5 {
    //截取部分数组
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copyArr= copyRange(arr, 3, 4);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }

    public static int[] copyRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
