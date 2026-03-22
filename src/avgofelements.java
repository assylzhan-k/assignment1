public class avgofelements {
    public static int sum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sum(arr, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        int n = arr.length;
        int total = sum(arr, n);
        double average = (double) total / n;
        System.out.println(average);
    }
}