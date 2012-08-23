/**
	Copyright (c) 2012 Roland Yonaba

	Permission is hereby granted, free of charge, to any person obtaining a
	copy of this software and associated documentation files (the
	"Software"), to deal in the Software without restriction, including
	without limitation the rights to use, copy, modify, merge, publish,
	distribute, sublicense, and/or sell copies of the Software, and to
	permit persons to whom the Software is furnished to do so, subject to
	the following conditions:

	The above copyright notice and this permission notice shall be included
	in all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
	OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
	MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
	IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
	CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
	TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
	SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
**/

// Illustrates Christian GoldBach's conjecture

import java.util.Scanner;

public class GoldbachConjecture {

	static boolean isPrime(int a)
	{
		boolean isMult = false;
		for (int i=2;i<a;i++)
		{
			isMult = ((a%i)==0);
			if (isMult) break;
		}
		return !(isMult);
	}
	
	static boolean isEven(int a)
	{
		return ((a%2)==0);
	}
	
	static void setCouple(int n)
	{
		if (isEven(n))
		{
			for (int i=1,j=n-i;i<=(n/2);i++,j--)			
			{
				if ((isPrime(i))&&(isPrime(j)))
					System.out.println(n+" = "+i+" + "+j);
			}
		}
		else
			System.out.println(n+ " is not even!");
		
	}
	
	public static void main(String[] args)
	{
		int n;
		char rep = 'Y';
		Scanner sc = new Scanner(System.in);
		
		while ((rep=='Y')||(rep == 'y'))
		{
			System.out.println("GoldBach Conjecture: \nEnter a number : ");
			n = sc.nextInt();
			setCouple(n);
			System.out.println("Try again ? (Y/N)");
			rep = sc.next().charAt(0);
					
		}
		System.out.println("-----Program Closed--------");		
	}
}
