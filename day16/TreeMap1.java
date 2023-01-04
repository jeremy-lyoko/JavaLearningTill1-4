import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        tm.put(1, 3232);
        tm.put(2, 3232);
        tm.put(3, 3232);
        System.out.println(tm);

    }
}
