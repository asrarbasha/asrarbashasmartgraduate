package smartgraduates;
import java.util.Scanner;
public class findareaoftriangle {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the width of triangle:");
		double width=scanner.nextDouble();
		System.out.println("enter the height of the triangle:");
		Double height=scanner.nextDouble();
		Double area=(width*height)/2;
		System.out.println("area of the triangle:"+area);
		
		
		
		
	}
	

}
