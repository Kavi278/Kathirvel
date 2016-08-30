import java.util.*;
class Strtow
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		try
		{
			System.out.println(Integer.parseInt(s));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
