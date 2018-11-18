import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class ListTest {
    public static void main(String[] args) {
//        listTest();
//        listContains();
//        listContains();
        listForeachTest();
    }

    public static void listTest() {
        List<String> list = new ArrayList<>();
        for (String s : list) {
            System.out.println(s);
        }

        Map<String, Integer> map = new HashMap<>();
        List<Map.Entry<String, Integer>> lists = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        for (Map.Entry<String, Integer> m : lists) {
            m.getKey();
            System.out.println(m.getKey());
        }

    }

    public static void listContains() {
        List<String> list = new ArrayList<>();
        list.add("abcd");
        list.add("asdf_abcc");
        list.add("dxy_110");
        list.add("dxy_haha");
        list.add("dxy_110");
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list.contains("abc"));
        System.out.println(collect);

        User user1 = new User("a", "nan", 12);
        User user2 = new User("b", "nv", 15);
        User user3 = new User("c", "nan", 13);
        User user4 = new User("a", "nv", 45);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        List<User> unique =
                userList.stream().collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getUsername))), ArrayList::new)
        );

        System.out.println(unique);
    }

    private static void listForeachTest(){
        List<String> list = new ArrayList<>();
        list.add("abcd");
        list.add("asdf_abcc");
        list.add("dxy_110");
        list.add("dxy_haha");

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String aValue = it.next();
            if("abcd".equals(aValue)) {
                it.remove();
            }
        }
        System.out.println(list);
//        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            String s = list.get(i);
//            if ("abcd".equals(s)) {
//                list.remove(s);
//            }
//        }

//        for (String s : list) {
//            if ("abcd".equals(s)) {
//                list.remove(s);
//            }
//        }
        System.out.println(list);
    }

    public static void listNoContent() {
        List<String> list = new ArrayList<>();

        for (String s : list) {

            System.out.println(s);
            System.out.println("++++");
        }

    }


}

class User {
    private String username;
    private String sex;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String username, String sex, int age) {
        this.username = username;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(username, user.username) &&
                Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username);
    }
}
