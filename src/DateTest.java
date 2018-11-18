import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        DateTest();
    }

    public static void DateTest(){
        Date date = new Date();
        try {
            Thread.sleep(1000);

        } catch (Exception e) {

        }
        Date date1 = new Date();
        System.out.println(date.before(date1));
    }

}
