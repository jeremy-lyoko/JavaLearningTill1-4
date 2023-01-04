import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap3 {
    public static void main(String[] args) {
        String s = "ashdshasdasdashf";
        char[] c = s.toCharArray();

        TreeMap<Character, Integer> tm = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1-o2;
            }
        });
        for (int i = 0; i < c.length; i++) {
            if (tm.containsKey(c[i])) {
                int count = tm.get(c[i]);
                count++;
                tm.put(c[i], count);
            } else {
                tm.put(c[i],1);
            }
        }

        System.out.println(tm);
    }
}
