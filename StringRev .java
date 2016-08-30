import java.util.Scanner;


public class StringRev 
{
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());

	}

}
