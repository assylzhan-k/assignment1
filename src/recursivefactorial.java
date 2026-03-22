import java.util.Scanner;
public class recursivefactorial {
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();
        long result = factorial(n);
        System.out.println(result);
        scanner.close();
    }
}