import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStream1 {
    public static void main(String[] args)throws IOException {

        PrintStream ps=new PrintStream(new FileOutputStream("..\\day21\\a.txt"),true,
                Charset.forName("GBK"));
        ps.print(98);
        ps.printf("当前年份是%s年","2023");
        ps.close();
    }
}
