import java.util.Scanner;

public class Area_triangle {
    static Scanner scan = new Scanner(System.in);

    public static void area() {
        System.out.println("Please enter side 1: ");
        double one = scan.nextDouble();
        System.out.println("Please enter side 2: ");
        double two = scan.nextDouble();
        System.out.println("Please enter side 3: ");
        double three = scan.nextDouble();

        if ((one + two) > three && (one + three) > two && (two + three) > one) {
            double s = (one + two + three) / 2;
            double area = Math.sqrt(s * (s - one) * (s - two) * (s - three));
            System.out.printf("Area is: %.2f", area);
        } else {
            System.out.println("Error!");
        }

    }
    public static void main(String[] args){
        area();
    }
}

