import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListTest {
    public static void main(String[] args) {

    }

    public static void arrayToList() {
        Integer[] a = {1, 2, 3, 4, 5};
        List<Integer> collect = Arrays.stream(a).collect(Collectors.toList());


    }

}
