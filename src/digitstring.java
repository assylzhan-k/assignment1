import java.util.Scanner;
public class digitstring {
    public static String isAllDigits(String s, int index) {
        if (index == s.length()) {
            return "Yes";
        }
        if (!Character.isDigit(s.charAt(index))) {
            return "No";
        }
        return isAllDigits(s, index + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        String result = isAllDigits(s, 0);
        System.out.println(result);
        scanner.close();
    }
}