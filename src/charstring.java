import java.util.Scanner;
public class charstring {
    public static int countChars(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return 1 + countChars(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string: ");
        String s = scanner.nextLine();
        int length = countChars(s);
        System.out.println(length);
        scanner.close();
    }
}