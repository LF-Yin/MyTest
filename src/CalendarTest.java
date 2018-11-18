import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * @author yinlf
 * @Description TODO
 * @Date 2018/8/27 下午7:10
 **/
public class CalendarTest {
    public static void main(String[] args) {
//        CalendarTest();
        test1();
    }

    public static void CalendarTest(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 0);

        String lastDay = format.format(calendar.getTime());
        System.out.println(lastDay);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.DAY_OF_MONTH, calendar1.getActualMaximum(Calendar.DAY_OF_MONTH));
        String lastDay2 = format.format(calendar1.getTime());
        System.out.println(lastDay2);

        Calendar calendar2 = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        String lastDay3 = format.format(calendar.getTime());
        System.out.println(lastDay3);
        Date time = calendar.getTime();
        System.out.println(calendar.getTime());
    }

    public static void test(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String time = "" + year + month + day;
        System.out.println(time);
    }

    public static void test1(){
        int compare = Objects.compare(1, 2, Integer::compareTo);
        System.out.println(compare);
    }
}
