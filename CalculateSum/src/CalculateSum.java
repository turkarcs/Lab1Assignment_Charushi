import java.util.Scanner;
public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int sum=0;
		sum=calculateSum(n,sum);
		System.out.println("Sum is : "+sum);
	}
	private static int calculateSum(int n,int sum) {
		for(int i=1;i<n;i++)
		{
			if((i%3==0) || (i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}

}
