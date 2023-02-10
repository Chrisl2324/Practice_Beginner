import java.sql.SQLOutput;

public class TwoChar {

    public static String twoChar(String str, int index) {
        if (str.length() >= index)
            return str.substring(index, index + 2);
        else {
            return str.substring(0, 2);
        }

    }
    public static void main(String[] args) {
        String result = twoChar("Hello", 2);
        System.out.println(result);
    }

}