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

//Computes the Gold Number

import java.io.IOException;
import java.util.Scanner;

public class GoldNumber {

	public static void main(String[] args) 
	{
		int n=2,un,un1=2,un2=1;
		float vn=10,vn1=2,eps;
		Scanner sc = new Scanner(System.in);
		System.out.println("----Gold Number----\nEnter Accuracy : ");
		eps = sc.nextFloat();
		System.out.println("<Press Enter> To Start;");
		try {System.in.read();}	catch (IOException err) {}
		
		
		for (n=2;;n++)
		{
			un = un1+un2;
			vn = (float)un/(float) un1;
				if (Math.abs(vn-vn1)<=eps) break;
				else
				{
					un2 = un1;
					un1=un;
					vn1=vn;					
				}
		}
		System.out.println("Gold Number found : "+vn+" after "+n+" iterations");
	}
}
