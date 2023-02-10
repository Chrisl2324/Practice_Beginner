public class NTwice {
    public static String nTwice(String str, int n){
        String front = str.substring(0, n);
        String back = str.substring(str.length() -n , str.length());
        String result = front + back;
        return result;
        }
    public static void main(String[] args) {
        String result1 = nTwice("Chocolate", 1);
        System.out.println(result1);
    }
}