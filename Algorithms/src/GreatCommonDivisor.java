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

//Computes GCD (Greatest Common Divisor) of two integers
// Using Euclide's and Egyptian methods
	
import java.io.IOException;
import java.util.Scanner;

public class GreatCommonDivisor {

	static int EuclidePgcd(int a,int b)
	{
		int t,r;
		if (b>a) 
		{
			t=a;
			a=b;
			b=t;
		}
		do
		{
			r = a%b;
			a=b;
			b=r;
		}
		while (r!=0);		
		return a;
	}
	
	static int EgyptPgcd(int a,int b)
	{
		while (a!=b)
		{
			a = (a>b)?a-b:a;
			b = (b>a)?b-a:b;
		}
		return a;
	}
	
	//Test
	public static void main(String[] args) {
	int a,b;
	Scanner keyb = new Scanner(System.in);
	System.out.println("Enter number a: ");
	a=keyb.nextInt();
	System.out.println("Enter number b: ");
	b=keyb.nextInt();
	System.out.println("Press <Enter> to compute GCD: ");	
	try {System.in.read();} catch (IOException e) {	;}
	System.out.println("Euclide GCD("+a+","+b+") = "+EuclidePgcd(a,b));
	System.out.println("Egyptian GCD("+a+","+b+") = "+EgyptPgcd(a,b));
	}
}
