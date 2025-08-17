import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("The Duplicate element in Array is: "+RemoveDuplicate(arr, n));
    }
    public static int RemoveDuplicate(int arr[],int n)
    {
        int xorArr=0;
        int xorRange=0;
        for(int i:arr)
        {
            xorArr=xorArr^i;
        }
        for(int i=1;i<n;i++)
        {
            xorRange^=i;
        }
        return xorArr^xorRange;
    }
}
