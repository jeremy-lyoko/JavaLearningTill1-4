import java.util.Calendar;
import java.util.Date;

public class Calendar1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        //System.out.println(d1);

        Calendar c = Calendar.getInstance();


        int y=c.get(Calendar.YEAR);
        c.set(Calendar.YEAR,2);
        System.out.println(y);
        System.out.println(c);
    }
}
