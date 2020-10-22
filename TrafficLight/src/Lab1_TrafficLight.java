
import java.util.*;
public class Lab1_TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any colour from Red,Green or Yellow :");
		String colour=sc.nextLine();
		switch(colour) {
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

}