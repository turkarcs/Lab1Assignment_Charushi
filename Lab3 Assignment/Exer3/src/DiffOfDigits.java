/**
 Author: Charushi
 Date: 27-10-2020
 Desc: Create a method that accepts a number and modifies it such that the each of the digit in the newly formed 
 number is equal to the difference between two consecutive digits in the original number. 
  */
import java.util.Scanner;
public class DiffOfDigits {

	public static void main(String[] args) {
		// Creation of an object
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        num=s.nextInt();
        String str=String.valueOf(num);
        System.out.println(str);
        int result=modifyNumber(str);
        System.out.println(result);
        
	}

	private static int modifyNumber(String str) //Method declaration
	{
		// TODO Auto-generated method stub
		int n=0;
		for(int i=0;i<str.length();i++)
		{
			if(i<str.length()-1)
			{
			    char ch1=str.charAt(i);
			    char ch2=str.charAt(i+1);
			    int num=ch1-ch2;
		     	if(num<0)
				    num=num*(-1);
			
			    n=num+n*10;
			}
			else
			{
				char ch1=str.charAt(i);
			    char ch2=str.charAt(0);
			    int num=ch1-ch2;
		     	if(num<0)
				    num=num*(-1);
		     	n=num+n*10;
			}
		}
		return n;
	}

}

