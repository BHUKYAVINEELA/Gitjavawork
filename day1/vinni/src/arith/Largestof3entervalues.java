package arith;
import java.util.Scanner;

public class Largestof3entervalues {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of a :");
		a= scan.nextInt();
		System.out.print("Enter value of b :");
		b= scan.nextInt();
		System.out.print("Enter value of c :");
		c= scan.nextInt();
		if(a>b && a>c)
		{
		System.out.println("a is bigger" +a);
		}	
		
		else if(b>c && b>a)
		{
			System.out.println("b is bigger" +b);
		}
		else
		{
			System.out.println("c is bigger"+c);
		}
	}

}
