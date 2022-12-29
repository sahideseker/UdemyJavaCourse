import java.util.Scanner;

public class MyFirst {
	public static void main(String[] args)
	{
		int m1,m2,m3;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter marks of 3 Subjects:");
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();

		float avg=(float)(m1+m2+m3)/3;
		if(avg>=70){
			System.out.println("Grade A");
		} 
			else if(60<=avg && avg<70) {
				System.out.println("Grade B");
		}
			else if(50<=avg && avg<60) {
				System.out.println("Grade C");
		}
			else if(40<=avg && avg<50) {
				System.out.println("Grade D");
		}
			else {
				System.out.println("Grade E");
	
		}
	}
}
