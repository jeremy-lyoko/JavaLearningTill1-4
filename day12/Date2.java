import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-E hh-mm-ss");
        Date d = new Date(12345666L);
        String format = sdf.format(d);
        System.out.println(format);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        String str = "1818-5-5 12-12-12";
        Date d2 = sdf2.parse(str);
        System.out.println(d2);
    }
}
