import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("李白","峨眉山月半轮秋");
        m.put("王维","独坐幽篁里");
        m.put("白居易","浅草才能没马蹄");

        m.forEach((kk,vv)->System.out.println(kk+"---"+vv)

        );
    }
}
