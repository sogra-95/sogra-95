package exceptionss;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Excestri {
	public static void main (String a[])throws Exception
	{
		String S = " ";
		System.out.println("enter String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = br.readLine ();
		System.out.println(S);
	}

}
