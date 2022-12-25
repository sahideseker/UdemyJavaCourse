import java.util.Scanner;

public class Udemy {

	public static void main(String[] args)
	{ Scanner s = new Scanner (System.in);
	float base , height;
	System.out.println("enter the base length:");
	base  = s.nextInt();
	System.out.println("enter the height:"  );
	height = s.nextInt();
	
	float area = base*height/2; 
	System.out.println("Area of Triangle is:" +  " " + area  );
	}

}
