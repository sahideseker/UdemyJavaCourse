import java.util.Scanner;

public class Udemy {

	public static void main(String[] args)
	{ 
	Scanner s = new Scanner (System.in);
	float base , height;
	System.out.println("enter the base length:");
	base  = s.nextFloat();
	System.out.println("enter the height:"  );
	height = s.nextFloat();
	
	float area = base*height/2; 
	System.out.println("Area of Triangle is:" +  " " + area  );
	}

}

/*
import java.util.Scanner;

public class MyFirst {

	public static void main(String[] args)
	{ 
	Scanner s = new Scanner (System.in);
	int a,b,c;
	float d,area;
	System.out.println("enter 3 sides of a triangle");
	a = s.nextInt();
	b = s.nextInt();
	c = s.nextInt();

	d= (a+b+c)/2f;
	
	area= (float) Math.sqrt(d*(d-a)*(d-b)*(d-c));
	
	System.out.println("area is:" + area);
	}
}
*/
