import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Test2();
    }

    public static void Test1(){

        Optional<String> optional = Optional.of("hello");

        System.out.println(optional.isPresent());
        System.out.println(optional);

    }
    public static void Test2(){
        Persion p = new Persion("yuwanx","teacher",18, 1);
        Optional<Persion> per = Optional.of(p);
//        per.isPresent((value) -> {System.out.println("1234");});
        Optional asd = Optional.of("123");
//        per.isPresent((value) -> {System.out.println("123" + value);});
        System.out.println(per.get().getName().toString());


    }

}
class Persion{

    private String Name;
    private String Job;
    private int Age;
    private int Gender;

    public Persion(String name, String job, int age, int gender) {
        Name = name;
        Job = job;
        Age = age;
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "Name='" + Name + '\'' +
                ", Job='" + Job + '\'' +
                ", Age=" + Age +
                ", Gender=" + Gender +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        Gender = gender;
    }
}