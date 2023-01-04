package staticdemo1;

public class ArrayUtil {
    private ArrayUtil(){}

    public static String printArr(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1){
                sb.append(arr[i]+",");
            }
            else sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();

    }
}
