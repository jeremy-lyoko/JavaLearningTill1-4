import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\1339\\IdeaProjects\\day20\\c.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        System.out.println(sb);

        String str = sb.toString();
        String[] arr = str.split("-");

        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arr) {
            list.add(Integer.parseInt(s));
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        FileWriter fw = new FileWriter("..\\day20\\d.txt");

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                fw.write(list.get(i) + "");
            else
                fw.write(list.get(i) + "-");
        }
        fw.close();
    }
}
