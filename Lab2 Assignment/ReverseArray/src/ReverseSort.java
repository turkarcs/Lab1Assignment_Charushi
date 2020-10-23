/**
 Author: Charushi
 Date: 22-10-2020
 Desc: Reversed array in sorted order
  */
import java.util.*;
public class ReverseSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			}
		ReverseSort obj=new ReverseSort();      //object creation
		obj.getSorted(arr);
	}
	void getSorted(int arr[])                   //Method to perform sorting and conversion
	{
		String str=Arrays.toString(arr);
		Arrays.sort(arr);
		System.out.println("Sorted array is: "+Arrays.toString(arr));
	}

}
