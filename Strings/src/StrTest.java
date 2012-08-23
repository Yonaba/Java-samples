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

// Playing with the String class

import java.lang.String;
public class StrTest {


	public static void main(String[] args) {
	String str1="abc",str2="def",str3;
	//Recherche d'occurence
	System.out.println(str1.indexOf("c"));
	System.out.println(str1.indexOf("e"));
	//Concaténation,comparaison
	str3 = str1+str2;
	System.out.println(str3.equals(str1.concat(str2)));
	char k = 'e';
	str3 = str1+String.valueOf(k);
	System.out.println("str3 : "+str3);
	//Conversion String tChar
	char t[] = str3.toCharArray();
	System.out.println("char t length: "+t.length);
	
	}

}
