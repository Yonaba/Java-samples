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

// Buffering Test with Java

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class IOstreams {
	//UnBuffered File Writing
	static void filewrite(String PathOfFile) {
		String pof = PathOfFile;
		try
		{
			FileWriter file = new FileWriter(pof);
			file.write("First Line\n");
			file.close();
		}
		catch (IOException err){System.out.println("UnBuffered Writing Error: "+err);}
	}
	static void BufFileWrite(String PathOfFile){
	//Buffered file writing
		String pof = PathOfFile;
		try
		{
			FileWriter stream = new FileWriter(pof);
			BufferedWriter out = new BufferedWriter(stream);
			out.write("First Line \nSecond Line");
			out.newLine();
			out.write("Third one.");
			out.close();
			
		}
		catch (IOException err){System.out.println("Unbuffered Reading Error: "+err);}
	}
		
	public static void main(String[] args) throws IOException{	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter File Name : ");
	String nm = sc.next();	
	System.out.println("Press Enter to proceed UnBuffered File: "+nm+" writing");
	System.in.read();	
	filewrite(nm);
	System.out.println("Done !");
	System.out.print("Enter another file name: ");	
	String nt = sc.next();
	System.out.println("Press Enter to proceed Buffered File: "+nt+" writing");
	System.in.read();
	BufFileWrite(nt);
	System.out.println("Done !");
	}
}
