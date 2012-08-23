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

// A number is said to be perfect when this number equals the sum
// of its srict divisors. Let's show the n-first perfect numbers
// counting from 1 upwards.

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) 
	{
		//Evaluates and Prints n-First Perfect Numbers
		Scanner sc = new Scanner(System.in);
		int n,found=0,sdiv,testnum=2,grow;
		
		System.out.println("Enter n:");
		n = sc.nextInt();
		System.out.println("The "+n+"-first perfect numbers are :");
		
		while (found < n)
		{
			testnum++;
			sdiv = 1;
			for (grow = 2;grow < testnum;grow++)
			{	if ((testnum % grow) == 0)
					sdiv = sdiv+grow;
			}
			if (sdiv == testnum)
			{
				System.out.println(testnum+" "+sdiv);
				found++;
			}
		}	
	}
}
