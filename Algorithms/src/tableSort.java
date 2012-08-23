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

// Various sorting algorithms implemented in Java

import java.util.*;

public class tableSort {
	//Returns the maximum element from a Int table
	static int maxtable(int t[])
	{
		int max=t[0],i;
		for (i=0;i< t.length;i++)
		{	if (t[i] > max) 
				max = t[i];
		}
		return max;
	}
	//Returns the minimum element from a Int table
	static int mintable(int t[])
	{
		int min=t[0],i;
		for (i=0;i<t.length;i++)
			if (t[i]<min) min = t[i];
		return min;
	}
	//Fills an Int table
	static void filltable(int t[])
	{
		//Inits Scanner Object
		Scanner sc = new Scanner(System.in);
		int i;
		for (i=0;i<t.length;i++)
		{
			System.out.println("Enter Element "+i);
			t[i]= sc.nextInt();
		}
	}
	//Displays an Int table
	static void disptable(int t[])
	{
		int i;
		for (i=0;i<t.length;i++)
			System.out.println("Element "+i+" : "+t[i]);
	}
	//Sort Method
	static void tribulle(int t[])
	{
		int j,tmp;
		for (int i:t)
			for (j=0;j<t.length-i;j++)
			{
				if (t[j] > t[j+1]) 
				{
					tmp = t[j];
					t[j]=t[j+1];
					t[j+1]=tmp;
				}
			}
	}//*/
	
	
	public static void main(String[] args) 
	{
		int tab[] = new int[5];
		filltable(tab);
		System.out.println("Min of Tab: "+mintable(tab));
		System.out.println("Max of Tab: "+maxtable(tab));
		System.out.println("Tab Sorted :");
		tribulle(tab);
		disptable(tab);
	}

}
