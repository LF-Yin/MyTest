import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        System.out.println();
//        Test1();
//        Test2();
//        Test3();
//        Test4();
//        Test5();
        streamTest();
    }

    public static void Test1() {

        new Thread(() -> System.out.println("nihao")).start();
    }

    public static void Test2() {
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
        System.out.println();
        features.forEach(System.out::println);
    }

    public static void Test3() {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter(languages, (str) -> str.toString().startsWith("J"));


        System.out.println("Languages which ends with a ");
        filter(languages, (str) -> str.toString().endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str) -> true);

        System.out.println("Print no language : ");
        filter(languages, (str) -> false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str) -> str.toString().length() > 4);


    }

    public static void filter(List names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach(
                (name) -> {
                    System.out.println(name);
                });

        System.out.println("-----------");
        //Predicate的测试
        Predicate<String> startWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;
//        names.stream().filter(startWithJ.and(fourLetterLong)).forEach((n) -> System.out.println(n));
        names.stream().filter(startWithJ.or(fourLetterLong)).forEach((n) -> System.out.println(n));

    }

    public static void Test4() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);

        for (Integer cost : costBeforeTax) {
            double price = cost + .12 * cost;
            System.out.println(price);
        }

        costBeforeTax.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);
        double bill = costBeforeTax.stream().map((cost) -> cost + .12 * cost).reduce((sum, cost) -> sum += cost).get();
        System.out.println(bill);
    }

    public static void Test5(){
        List<String> list = Arrays.asList("bb", "cc", "dd", "ee", "aa");

        LinkedList<String> link = list.stream().collect(Collectors.toCollection(LinkedList::new));
        Collections.shuffle(link);
        link.add(0,"aa");
        System.out.println(link);
        link = link.stream().distinct().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(link);

    }

    public static void streamTest(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("skip:");
        numbers.stream().skip(2).forEach(System.out::println);

        System.out.println("limit:");
        numbers.stream().limit(2).forEach(System.out::println);
    }

}