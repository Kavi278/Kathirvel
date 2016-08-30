import java.util.Scanner;


public class Factorial 
{
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
