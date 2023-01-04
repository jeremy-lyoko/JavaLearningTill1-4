import java.time.ZoneId;
import java.util.Set;

public class Zone1 {
    public static void main(String[] args) {


        Set<String> str = ZoneId.getAvailableZoneIds();
        System.out.println(str);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
    }
}
