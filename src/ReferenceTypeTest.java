import java.util.HashMap;
import java.util.Map;

/**
 * @author yinlf
 * @Description TODO
 * @Date 2018/8/29 上午11:45
 **/
public class ReferenceTypeTest {
    public static void main(String[] args) {
        IntegerTest();
        ifTest();
    }

    public static void IntegerTest(){
        Integer a = 123456;
        Integer b = 123456;
        System.out.println(a.equals(b));
    }

    public static void ifTest(){
        int a = 10;
        if(a > 1){
            System.out.println(1);
        } else if (a > 2){
            System.out.println(2);
        }
    }

}
