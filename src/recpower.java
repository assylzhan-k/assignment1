import java.util.Scanner;
public class recpower {
    public static long power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = scanner.nextInt();
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        long result = power(a, n);
        System.out.println(result);
        scanner.close();
    }
}