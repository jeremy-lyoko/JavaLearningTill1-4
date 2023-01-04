public class Regex1 {
    public static void main(String[] args) {
        //判断首位字母一致 a123a,b123b
        String regex="(.).+\\1";
        System.out.println("a123a".matches(regex));
    }
}
