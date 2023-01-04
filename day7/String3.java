public class String3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String result = arrToString(arr);
        System.out.println(result);
    }

    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        result=result+"]";
        return result;
    }
}
