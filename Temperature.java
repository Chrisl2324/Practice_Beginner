import java.util.Scanner;
public class Temperature {
    static Scanner scan = new Scanner(System.in);

    public static void temp_convert(){
        System.out.println("Please enter a celsius temp: ");
        double a = scan.nextDouble();
        double result = (1.8*a) +32;
        System.out.printf("Celsius temp is: %.2f", result);

    }
    public static void main(String[] args){
        temp_convert();

    }
}
