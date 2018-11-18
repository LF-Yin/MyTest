import com.sun.tools.javac.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class StringTest {
    public static void main(String[] args) {
        stringTest();
    }

    public static void stringTest(){
        Map map = new HashMap();
        String a = "";
        map.put("a", a);
        map.get("a");
        String a1 = String.valueOf(map.get("a"));
        System.out.println(a1);
    }
}
