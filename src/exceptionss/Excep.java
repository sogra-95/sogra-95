package exceptionss;

public class Excep {
	public static void main (String a[])
	{
		try
	
	{
		int i,j,k;
		int z[]=new int [5];
		z[0]=1;z[1]=2;z[2]=3;z[3]=4;z[4]=5;z[5]=6;
		i = 4;
		j = 0;
		k = i/j;
		System.out.println(k);
	}
catch (ArithmeticException e)
		{
	System.out.println("you  can't divide it by Zero");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("max index");
		}
		catch (Exception e)
		{
			System.out.println("unknown error");
		}
}
}