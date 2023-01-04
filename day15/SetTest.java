import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("张");
        s.add("李");
        s.add("王");
        System.out.println(s);
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
        for (String s1 : s) {
            System.out.print(s1);
        }
        s.forEach(str-> System.out.println(str));
    }
}
