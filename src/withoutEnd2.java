public class withoutEnd2 {

    public static String withoutEnd2(String str) {
        if (str.length() > 2) {
            String middle = str.substring(1, str.length()-1);
            return middle;
        } else {
            return " ";
        }
    }

    public static void main(String[] args) {
        String result = withoutEnd2("abc");
        System.out.println(result);

    }
}
