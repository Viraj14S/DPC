package com;

import java.util.Scanner;

public class Day1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int n=sc.nextInt();
	System.out.println("Enter the elements of Array");
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Array Before Sort");
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	sort(arr);
}

public static void sort(int arr[])
{
	int low=0,  mid=0, high=arr.length-1;

	while(mid<=high)
	{
		if(arr[mid]==0)
		{
			swap(arr,low,mid);
			low++;
			mid++;
		}
		else if(arr[mid]==1) {
			mid++;
		}
		else {
			swap(arr, mid, high);
			high--;
		}
	}
	
	System.out.println("Array After Sort");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
}

public static void swap(int arr[],int i,int j)
{
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
