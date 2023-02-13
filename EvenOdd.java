import java.util.Scanner;
public class EvenOdd {
    static Scanner scan = new Scanner(System.in);

    public static void even_odd(){
        System.out.println("Please enter a number: ");
        int a = scan.nextInt();
        if(a % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
        even_odd();

    }
}
