public class Regex2 {
    public static void main(String[] args) {
        //口吃替换
        String str1="我要要要学学吉吉吉他";
        String  str2=str1.replaceAll("(.)\\1+","$1");
        System.out.println(str2);
    }
}
