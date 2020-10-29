/**
 Author: Charushi
 Date: 27-10-2020
 Desc: Display integer and sum of all integers
  */
import java.util.*;
public class SumInt {

	public static void main(String[] args) {
		// Initialization
		int number;
		int sum=0;
		Scanner sc=new Scanner(System.in);  //object creation
		String str=sc.nextLine();     
		StringTokenizer st=new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			number=Integer.parseInt(temp);
			System.out.println(number);
			sum=sum+number;
		}
        System.out.println("sum:"+sum);
   
	}

}
