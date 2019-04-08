import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*String str = new String("hello world!");
        System.out.println(str.substring(5));
        List<? extends Object> a = new ArrayList<>();*/

        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0, j = 500; i < j; i++) {
            list.add("A" + i);
        }

        int i = 0;
        List<String> list1 = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int size = list.size();

        for (String st : list) {
            i++;

            if (i % 200 == 0 || i == size) {
                sb.append(st);
                list1.add(sb.toString());
                System.out.println(list1);
                list1.clear();
                sb.setLength(0);
            } else {
                sb.append(st + ",");
            }
        }

        List<String> a = new ArrayList<String>(50);

        i = 0;
        list.forEach(str -> {});

        enumTest();
    }


    public static void enumTest(){
        System.out.println("----");
        EnumTest.valueOf("a");
        System.out.println(EnumTest.valueOf("a").getValue());
        Random random = new Random();
        List<Integer> collect = random.ints(1000, 1, 50).boxed().collect(Collectors.toList());
    }
}
