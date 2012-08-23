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

// Palyndroms, in Java

import java.util.Scanner;

public class Palindroms {
	
	static String Recap(String str)
	{
		str = str.toLowerCase();
		String t="";
		for (int i=0;i<str.length();i++)
		{
			if ((str.charAt(i)!='.')&&(str.charAt(i)!=',')&&(str.charAt(i)!='\'')&&(str.charAt(i)!=' '))
			t +=str.charAt(i);
			
		}
		return t;
	}
	static String Reverse(String str)
	{
		String str2="";
		for (int i=str.length()-1;i>=0;i--)
		{
			str2 +=str.charAt(i);			
		}
		return str2;
	}
	
	static boolean isPalynd(String str)
	{
		str = Recap(str);		
		String str2 = Reverse(str);		
		return (str.equals(str2));
	}

	public static void main(String[] args)
	{
		String Opalynd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		Opalynd = sc.nextLine();		
		System.out.println(" Is it a Palyndrom ? : "+isPalynd(Opalynd));
		
	}

}
