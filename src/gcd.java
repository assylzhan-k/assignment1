import java.util.Scanner;
public class gcd {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = scanner.nextInt();
        int result = gcd(a, b);
        System.out.println("gcd: " + result);
        scanner.close();
    }
}