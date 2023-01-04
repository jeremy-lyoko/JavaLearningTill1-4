public class test6 {
    public static void main(String[] args) {
        //数组录入
        int number = 12345;
        int temp2 = number;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
        int[] arr = new int[count];
        int index = count - 1;
        while (temp2 != 0) {
            int ge = temp2 % 10;
            temp2 = temp2 / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //加密
       for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //拼接
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
       
    }
}
