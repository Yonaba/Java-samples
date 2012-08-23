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

// Solves linear equations (ax^2+bx+c=0)

import java.util.Scanner;

public class Equation2ndDeg {
	
	static void resol(double a,double b, double c)
	{
		double d,x1,x2;
		if (a==0)
		{
			if (b==0)
		
			{	if (c==0)
				System.out.println("R is solution.");
				else System.out.println("No solution");
			}
			else 
			{
				x1 = c/b;
				System.out.println("x = "+x1);
			}
			
		}
		else 
		{
			d = Math.pow(b,2)-4*a*c;
			if (d==0)
			{
				x1 = -b/(2*a);
				System.out.println("Real double root x0 = "+x1);
			}
			else
			{
				x1 = (-b-Math.sqrt(d))/(2*a);
				x2 = (-b+Math.sqrt(d))/(2*a);
				System.out.println("x1 = "+x1+"\nx2 = "+x2);
			}
		}
		System.out.println(".........Program Closed.........");		
		
	}
	
	public static void main(String[] args) 
	{	
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("----Equation solver (ax^2+bx+c=0)-----");
		System.out.println("Enter a, b, and c coefficient: ");
		a=sc.nextDouble(); b=sc.nextDouble(); c=sc.nextDouble();
		System.out.println("Equation: "+a+"x^2 + "+b+" x + "+c);
		resol(a,b,c);
	}

}
