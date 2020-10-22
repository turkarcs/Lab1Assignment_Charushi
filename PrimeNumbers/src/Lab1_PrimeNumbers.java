
import java.util.Scanner;
 public class Lab1_PrimeNumbers
 {
		public static void main(String[] args)
		{
			int n,prime;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			n=sc.nextInt();
			for(int i=2;i<n;i++)
			{
				prime=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					prime =1;
				}
				if(prime==0)
					System.out.println(i);
			}
		}
	}