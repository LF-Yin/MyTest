import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExTest {
    public static final String regEx_html = "<[^>]+";
    public static void main(String[] args) {
        regTest();
    }

    public static void regTest(){
        String htmlStr = "<table><table/>";
        Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
        Matcher m_html = p_html.matcher(htmlStr);
        htmlStr = m_html.replaceAll("");

        System.out.println(m_html.find());
        System.out.println(htmlStr + ":123");
    }
}
