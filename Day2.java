import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the element in Array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing element from Array is: " + FindMissingElement(arr));
    }

    public static int FindMissingElement(int arr[]) {
        int n = arr.length;
        int sum = 0;
        int total = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum - total;
    }
}
