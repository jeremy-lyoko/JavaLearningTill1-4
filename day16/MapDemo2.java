import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int vote = r.nextInt(arr.length);
            list.add(arr[vote]);
        }


        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : list) {
            if (hm.containsKey(s)) {
                int count = hm.get(s);
                count++;
                hm.put(s, count);
            } else {
                hm.put(s, 1);
            }
        }
        System.out.println(hm);

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> e : entries) {
            Integer value = e.getValue();
            if (max < value) {
                max = value;
            }
        }
        String key = null;
        for (Map.Entry<String, Integer> e : entries) {
            if (e.getValue() == max) {
                key = e.getKey();
            }

        }

        System.out.println(key);

    }
}
