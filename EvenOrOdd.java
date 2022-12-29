package Udemy;
import java.util.Scanner;

public class Udemy {
	public static void main(String[] args)
	{
		int n;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		
		if(n %2==0){
			System.out.println("It is a Even Number.");
		} 
			else{
			System.out.println("It is a Odd Number.");
		}

	}
}
