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

//Computes and displays N-First Prime numbers

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args)
	{

		int n,found=0,num=0;
		boolean isMult = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N : ");
		n = sc.nextInt();
		
		while (found<n)
		{
			num++;
			for (int i=2;i<num;i++)
			{
				isMult = ((num%i)==0);
				if (isMult) break; 					
			}
			if (isMult) continue;
			else 
			{
				System.out.println(num);
				found++;
			}
		}
	}
}
