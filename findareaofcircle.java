package smartgraduates;
import java.util.Scanner;
public class findareaofcircle {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the radius:");
		double radius=scanner.nextDouble();
		double area =Math.PI * (radius *radius);
		System.out.println("the area of the circle is:"+area);
double circumference=Math.PI * 2*radius;
System.out.println("the circumference of the circle is:"+circumference);


		
		
		
		
	}

}
