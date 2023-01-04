import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("阿根廷", "梅西");
        m.put("葡萄牙", "c罗");
        m.put("法国", "姆巴佩");
        System.out.println(m);System.out.println();
        Set<Map.Entry<String, String>> entries = m.entrySet();
        entries.forEach((Map.Entry<String, String> s) -> {
            System.out.println(s.getKey());
        });

    }
}
