import java.util.*;

public class MapTest {
    public static void main(String[] args) {
//        entryTest();
        printMap();
    }

    public static void entryTest(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }

    public static void printMap(){
        Map map = getMap();
        map.put("haha0", "haha0");
        map.put("haha1", "haha1");
        map.put("haha2", "haha2");
        map.put("haha3", "haha3");
        System.out.println(map);
    }

    public static Map getMap(){
        return new LinkedHashMap(2);
    }

}
