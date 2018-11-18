import java.util.Arrays;
import java.util.List;

public class ConsumerTest {
    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    public static <T> void foreach(List<T> list, Consumer<T> c) {
        for (T i : list) {
            c.accept(i);
        }
    }

    public static void main(String[] args) {
        foreach(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
    }

}
