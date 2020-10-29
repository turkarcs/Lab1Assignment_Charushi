/**
 Author: Charushi
 Date: 27-10-2020
 Desc: Create the mirror image of a String and return the two Strings separated with 
 	   a pipe(|) symbol 
  */
import java.util.Scanner;

public class MirrorImage {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);              //object creation
		String str=sc.nextLine();
		String result=getImage(str);           //get mirror image of given string
		System.out.println(str+"|"+result);

	}
	private static String getImage(String str)    //method declaration
	{
		StringBuilder sb=new StringBuilder(str);
		sb=sb.reverse();
		String res=sb.toString();
		return res;
	}
}
