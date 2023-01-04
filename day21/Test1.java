import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//软件使用次数
//不能直接count++因为内存不记录
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("..\\day21\\count.txt"));

        String line = br.readLine();
        int count = Integer.parseInt(line);
        count++;

        if (count < 4) {
            System.out.println("welcome to use");
        } else System.out.println("please register");

        FileWriter fw = new FileWriter("..\\day21\\count.txt");
//新对象会清空旧文件
        fw.write(count + "");
//转字符串否则是ascii码
        fw.close();
        br.close();
    }


}
