package arith;
import java.util.Scanner;

public class Largestof3num {

	public static void main(String[] args) {
		int a=19,b=10,c=12;
		Scanner scan = new Scanner(System.in);
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


