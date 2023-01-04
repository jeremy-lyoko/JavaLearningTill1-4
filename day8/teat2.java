public class teat2 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        boolean flag = check(strA, strB);
        if (flag) System.out.println("right");
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
