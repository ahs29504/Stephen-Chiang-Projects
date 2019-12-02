//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class primeRunner
{
	public static void main ( String[] args )
	{
		Prime a = new Prime();
		a.setPrime(24);
		a.isPrime();
		System.out.println(a.toString());
		
		a.setPrime(7);
		a.isPrime();
		System.out.println(a.toString());
		
		a.setPrime(100);
		a.isPrime();
		System.out.println(a.toString());
		
		a.setPrime(113);
		a.isPrime();
		System.out.println(a.toString());
		
		a.setPrime(65535);
		a.isPrime();
		System.out.println(a.toString());
		
		a.setPrime(2);
		a.isPrime();
		System.out.println(a.toString());
		
		a.setPrime(7334);
		a.isPrime();
		System.out.println(a.toString());
		
		a.setPrime(7919);
		a.isPrime();
		System.out.println(a.toString());
		
		a.setPrime(1115125003);
		a.isPrime();
		System.out.println(a.toString());
		
		
		
		
		
	}	
}