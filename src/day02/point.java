package day02;
import java.util.Scanner;
public class point {

	public class Ex01 {
	public static void main(String[] args) {
		Scanner var1 = new Scanner(System.in);
		System.out.print("What is your name?");
		String name = var1.next();
		int point1;
		System.out.println("Your Language is : ");
		point1 = var1.nextInt();
		int point2;
		System.out.println("Your English is : ");
		point2 = var1.nextInt();
		System.out.println("Your Mathmatics is : ");
		int point3;
		point3 = var1.nextInt();
		System.out.println("Your name is "+name+".");
		System.out.println("You got "+point1+" points in Language.");
		System.out.println("You got "+point2+" points in English.");
		System.out.println("You got "+point3+" points in Mathmatics.");
		var1.close();
		}	
	}
}
