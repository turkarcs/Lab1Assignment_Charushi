
public class SalName {

	public static void main(String[] args) 
	{
		String arr[][] = new String[2][];    //Declaration
		arr[0] = new String[]{"Mr", "Ms", "Mrs"};
		arr[1] = new String[]{"Pratik", "Aishwarya", "Surya", "Dushyant", "Somesh", "Praveen"};

		for(int i=0;i<=5;i++)
		{
			if(arr[1][i] == "Pratik" || arr[1][i] == "Dushyant" || arr[1][i] == "Somesh" || 
					arr[1][i] == "Praveen") //If the names are male
			{
				System.out.println(arr[0][0]+" "+arr[1][i]);
			}
			else if(arr[1][i] == "Surya") //If the name is female and unmarried
				System.out.println(arr[0][1]+" "+arr[1][i]);
			else 	//If the name is female and married
				System.out.println(arr[0][2]+" "+arr[1][i]);
		}


	}

}