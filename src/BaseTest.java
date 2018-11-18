import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BaseTest {
    public static void main(String[] args) {
        getSum(1,2,3,4,5);
        getSize();
    }

    public static void getSum(int... a){
        System.out.println(a.getClass().getName());
        long count = Arrays.stream(a).sum();
        System.out.println(count);
    }

    public static void getSize(){
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
    }
}
