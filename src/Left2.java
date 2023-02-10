public class Left2 {

    public static String left2(String str){
        String back = str.substring(2, str.length());
        String front = str.substring(0,2);
        return back + front;
    }
    public static void main(String[] args){
        String result = left2("Hello");
        System.out.println(result);
    }
}
