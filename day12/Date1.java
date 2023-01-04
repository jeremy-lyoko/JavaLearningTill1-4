import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        Date d2=new Date(0L);
        System.out.println(d2);

        long time = d2.getTime();
         long time2=d.getTime();

         if(time2>time){
             System.out.println(time2);
         }

    }
}
