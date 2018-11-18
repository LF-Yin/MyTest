import com.sun.deploy.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        stringToInteger();
    }

    public static void stringToInteger() {
        String str = "13692579,245324,123,12,43,68,09";
        char[] chars = str.toCharArray();

        System.out.println(chars.toString());
        Stream.of(chars).forEach(a -> System.out.println(a));
        String[] a = StringUtils.splitString(str, ",");

        Integer[] s = Stream.of(a).map(Integer::new).toArray(Integer[]::new);
        System.out.println(s);


        List<Integer> collect = Stream.of(a).map(s1 -> Integer.valueOf(s1)).sorted().collect(Collectors.toList());

        System.out.println(collect);
    }

}
