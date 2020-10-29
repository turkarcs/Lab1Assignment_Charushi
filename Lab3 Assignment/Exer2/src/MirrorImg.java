import java.util.Scanner;

public class MirrorImg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int k=str.length();
		//System.out.println(k);
		for(int i=0;i<k;i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("||");
      
		for(int i=(k-1);i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}

