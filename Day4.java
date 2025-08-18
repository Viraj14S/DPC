import java.util.*;

public class InPlaceMerge {

    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap + 1) / 2;
    }

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int gap = m + n;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            int i, j;
            for (i = 0; i + gap < m; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    swap(arr1, i, arr1, i + gap);
                }
            }
            for (j = (gap > m) ? gap - m : 0; i < m && j < n; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    swap(arr1, i, arr2, j);
                }
            }
            for (j = 0; j + gap < n; j++) {
                if (arr2[j] > arr2[j + gap]) {
                    swap(arr2, j, arr2, j + gap);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int[] b, int j) {
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements of arr1 (space-separated): ");
        String line1 = sc.nextLine().trim();
        line1 = line1.replace("arr1 =", "").replace("[", "").replace("]", "").trim();
        int[] arr1 = Arrays.stream(line1.split("\\s+|,"))
                           .filter(s -> !s.isEmpty())
                           .mapToInt(Integer::parseInt)
                           .toArray();
        System.out.print("Enter elements of arr2 (space-separated): ");
        String line2 = sc.nextLine().trim();
        line2 = line2.replace("arr2 =", "").replace("[", "").replace("]", "").trim();
        int[] arr2 = Arrays.stream(line2.split("\\s+|,"))
                           .filter(s -> !s.isEmpty())
                           .mapToInt(Integer::parseInt)
                           .toArray();
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        sc.close();
    }
}
