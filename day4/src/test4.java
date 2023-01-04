import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        //验证码
        //5位验证码，前四位大小写字母，最后一位数字
        //构建一个大小写字母的数组
        char[] letter = new char[52];
        for (int i = 0; i < 52; i++) {
            if (i < 26)
                letter[i] = (char) (i + 97);
            else
                letter[i] = (char) (i + 65 - 26);
        }
        /*for (int i = 0; i < 52; i++) {
            System.out.print(letter[i] + " ");
        }*/
        String result=" ";
        //
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(letter.length);
            result=result+letter[randomIndex];
        }
        int num=r.nextInt(10);
        System.out.println(result+num);
    }
}
