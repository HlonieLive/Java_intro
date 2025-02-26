import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your number: \n");
        num = number.nextInt();

        if (is_even_or_odd(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        number.close();
    }
    public static boolean is_even_or_odd(int num) {
        return num%2 ==0;
    }
}
