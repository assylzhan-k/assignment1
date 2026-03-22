import java.util.Scanner;
public class reversa {
    public static void readAndPrintReverse(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        int num = scanner.nextInt();
        readAndPrintReverse(n - 1, scanner);
        System.out.print(num + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HOW many numbers: ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " numbers:");
        readAndPrintReverse(n, scanner);
        System.out.println();
        scanner.close();
    }
}