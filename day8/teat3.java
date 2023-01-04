public class teat3 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        char[] arr = strA.toCharArray();
        char first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length-1]=first;
        String result=new String(arr);
        System.out.println(result);
    }

    public static boolean check(String strA, String StrB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(StrB)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str) {
        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;
    }
}
