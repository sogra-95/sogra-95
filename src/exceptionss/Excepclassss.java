package exceptionss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepclassss {
	public static void main (String a[])
	{
		BufferedReader br =null;
		try
		{
		int i,j,k;
		System.out.println("enter 2 no");
		InputStreamReader is = new InputStreamReader(System.in);
		br = new BufferedReader(is);
		i = Integer.parseInt(br.readLine());
		j = Integer.parseInt(br.readLine());
		k= i/j;
		System.out.println(k);
		
	}
		catch(IOException e)
		{
			System.out.println(e);
		}
finally 
{
	try
	{

	
	br.close();
	System.out.println("resource released");
}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	}
}
