public class phone {
    public static void main(String[] args) {
        String number = "13123344321";
        String s1 = number.substring(0, 3);
        String s2 = number.substring(7);
        String result = s1 + "****" + s2;
        System.out.println(result);
        String n = number.substring(3, 4);
        char c = number.charAt(3);
        System.out.println(n);
        System.out.println(c);
        System.out.println(n + 9 + (c + 9));
    }
}
