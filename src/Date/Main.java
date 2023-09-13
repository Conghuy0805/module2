package Date;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // Hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println("TEST");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Trước khi chạy for: " + t1);
        System.out.println("Sau khi chạy for: " + t2);
        System.out.println("Thời gian: " + (t2 - t1) + " mls");
        System.out.println("Thời gian: " + ((t2 - t1) / 1000) + " s");
        System.out.println();

        // TimeUnit
        System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 * 365) + " s");
        System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");
        System.out.println();

        // Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));
        System.out.println();

        // Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE) + " - " + (c.get(Calendar.MONTH) + 1) + " - " + c.get(Calendar.YEAR));

        c.add(Calendar.HOUR,30);
        System.out.println(c.get(Calendar.DATE) + " - " + (c.get(Calendar.MONTH) + 1) + " - " + c.get(Calendar.YEAR));

        c.add(Calendar.DATE, 14);
        System.out.println(c.get(Calendar.DATE) + " - " + (c.get(Calendar.MONTH) + 1) + " - " + c.get(Calendar.YEAR));

        // DateFormat
        DateFormat df= new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        System.out.println(df.format(d));

    }
}
