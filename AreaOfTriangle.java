import java.util.Scanner;

public class Udemy {

	public static void main(String[] args)
	{ Scanner s = new Scanner (System.in);
	float base , height;
	System.out.println("enter the base length:");
	base  = s.nextFloat();
	System.out.println("enter the height:"  );
	height = s.nextFloat();
	
	float area = base*height/2; 
	System.out.println("Area of Triangle is:" +  " " + area  );
	}

}
