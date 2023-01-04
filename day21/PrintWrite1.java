import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWrite1{
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter(new FileWriter("..\\day21\\b.txt"),true);

        pw.write(101);
        pw.close();
    }
}
