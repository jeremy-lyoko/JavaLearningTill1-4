public class StringBuilder1 {
    public static void main(String[] args) {
     int[] arr={1,2,3};

        System.out.println(toTheString(arr));


    }
    public static String toTheString(int[] arr){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb=sb.append(arr[i]);
        }
        return sb.toString();
    }
}
