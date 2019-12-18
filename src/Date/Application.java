package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.toString());
        //Lúc nào cũng tạo ra 1 đối tg duy nhất
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.DAY_OF_MONTH,15);
        calendar.set(calendar.MONTH,10);
        calendar.set(calendar.DATE,20);

        Date d = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(d));
        Date d2 = simpleDateFormat.parse("12/10/2019 00:00:00");
        System.out.println(d2);
        System.out.println(d);
    }
}
