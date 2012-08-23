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

// Celsius-Farenheit conversion

import java.util.*;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tinit,tfin,pivot,pas,celsius;
		double far;
		char s='Y';
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("CELSIUS-FARHENHEIT");
		System.out.println("--------------------------------\n\n");
		while (s=='Y')
		{
		System.out.println("Enter lower bound");
		tinit = sc.nextInt();
		System.out.println("Enter upper bound");
		tfin = sc.nextInt();
		if (tfin < tinit) 
			{
				pivot = tinit;
				tinit = tfin;
				tfin = pivot;
			}
		System.out.println("Enter step");
		pas = sc.nextInt();
		pas = ((tfin-tinit)<pas) ? tfin-tinit:pas;
		System.out.println("Conversion table");
		System.out.println("-------------------------------");
		System.out.println("  Celsius |  Farenheit   ");
		System.out.println("-------------------------------");
		int i = 0;
		while ((tinit+(i*pas))<=tfin)
		{
			celsius = tinit+i*pas;
			far = celsius*(9/5)+32;
			System.out.println ("\t"+celsius+"\t"+far);
			i++;
		}
		System.out.println("Restart ? (Y/N)");
		s = sc.next().charAt(0);
		}

	}

}
