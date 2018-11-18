import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public class ObjectTest {
    public static void main(String [] args){
        Map<String, Object> map = new HashMap<>();
        change(map);
        System.out.println(map);

        Object o = map.get("q");
        System.out.println(o);

//        String a = null;
//        System.out.println(a.equals("123"));
        userTest();

    }

    private static void userTest(){
        Children children = new Children();
        children.setUser(new Children(1, "a", null));
        Integer id = Objects.isNull(children.getUser()) ? 0 : children.getUser().getId();
        System.out.println(id);
    }

    public static void change(Map map){
        map.put("hello","world");
    }
}

class Children{
    Integer id;
    String name;
    Children user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Children getUser() {
        return user;
    }

    public void setUser(Children user) {
        this.user = user;
    }

    public Children() {
    }

    public Children(Integer id, String name, Children user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }
}