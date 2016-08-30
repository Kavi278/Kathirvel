import java.util.Scanner;


public class ReverseIntegers
{
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = String.valueOf(n);
		StringBuffer sb = new StringBuffer(s).reverse();
		String f = String.valueOf(sb);
		Integer res = Integer.valueOf(f);
		System.out.println(res);
	}

}
