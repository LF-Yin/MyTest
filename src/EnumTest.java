public enum EnumTest {

    a(1,"1A"),
    b(2,"2B");

    int id;
    String value;

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    EnumTest(int id, String value) {
        this.id = id;
        this.value = value;
    }
}
