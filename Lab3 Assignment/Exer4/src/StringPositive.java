/**
 Author: Charushi
 Date: 27-10-2020
 Desc: Create a method that accepts a String and checks if it is a positive string 
  */

import java.util.*;
public class StringPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean result=PositiveString(str);
        System.out.println(result);
	}

	private static boolean PositiveString(String str) //method for positive string
	{
		for(int i=0;i<str.length()-1;i++)
        {
	         if(str.charAt(i)<str.charAt(i+1)) //comparison
	         {
	        	 int j=0;
	         }
	         else 
	        	 return false;        
        }
		return true;
	}

}