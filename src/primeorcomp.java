import java.util.Scanner;
public class primeorcomp {
    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();
        if (isPrime(n, n / 2)) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }
        scanner.close();
    }
}