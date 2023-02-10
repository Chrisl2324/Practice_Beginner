public class TheEnd {

    public static String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0,1);
        }else {
            return str.substring(str.length()-1);
        }
    }
    public static void main(String[] args){
        String result = theEnd("Hello", false);
        System.out.println(result);
        }
}
