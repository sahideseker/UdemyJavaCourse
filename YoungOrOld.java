import java.util.Scanner;

public class Udemy {
	public static void main(String[] args)
	{
		int age;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter your age:");
		age=s.nextInt();
		
		if(age>14 && age<55){
			System.out.println("You are young ");
		} 
			else if (age<14){
			System.out.println("You are a child");
		}
			else if (age>55) {
				System.out.println("You are a old");
			}
	}
}

/*
import java.util.Scanner;

public class Udemy {
	public static void main(String[] args)
	{
		int age;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter your age:");
		age=s.nextInt();
		
		if(age>14 && age<55){
			System.out.println("You are young ");
		} 
			else {
				System.out.println("You are not young");
			}
	}
}
*/

