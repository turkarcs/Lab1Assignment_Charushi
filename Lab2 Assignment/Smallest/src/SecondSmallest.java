/**
 Author: Charushi
 Date: 22-10-2020
 Desc: Second smallest element of an array
  */
import java.util.*;
public class SecondSmallest {
	public static int getSecondSmallest(int array[],int size)
	{
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array[1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int arraySize=sc.nextInt();
		int []array=new int [arraySize];
		for(int index=0;index<arraySize;index++)
		{
			array[index]=sc.nextInt();		
			}

	int result= getSecondSmallest(array,arraySize);
	System.out.println("Second smallest element is: "+result);
	sc.close();
	}
}
