import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> leaders = findLeaders(arr, n);
        System.out.println("Leaders: " + leaders);
        
        sc.close();
    }

    public static List<Integer> findLeaders(int[] arr, int n) {
        List<Integer> leaders = new ArrayList<>();
        int maxSoFar = arr[n - 1];
        leaders.add(maxSoFar);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxSoFar) {
                leaders.add(arr[i]);
                maxSoFar = arr[i];
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
}