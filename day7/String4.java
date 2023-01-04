public class String4 {
    public static void main(String[] args) {
        System.out.println(reverse("sbc"));
    }

    public static String reverse(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            newStr = newStr + c;
        }
        return newStr;
    }
}
