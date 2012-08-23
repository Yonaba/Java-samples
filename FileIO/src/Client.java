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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Client 
{
	private int number;
	private String name;
	private String lname;
	private String address;
	private static final String sep = "#";
	private static final String[] fields = {"number : ","name : ","Family name : ","address : "};
	//Default Constructor
	public Client()
	{
		number = 0;
		name = "";
		lname = "";
		address = "";
	}
	//Constructor
	public Client(int pnum,String nm,String lnm,String add)
	{
		number = pnum;
		name = nm;
		lname = lnm;
		address =add;
	}
	//Saves Client info
	public void saveData(String Path) throws IOException
	{
		FileWriter t = new FileWriter(Path);
		BufferedWriter buf = new BufferedWriter(t);
		buf.write(this.number+sep+this.name+sep+this.lname+sep+this.address+sep);
		buf.close();
	}
	//Reads Client info
	public void readInfo(String Path) throws IOException
	{
		FileReader t = new FileReader(Path);
		BufferedReader buf = new BufferedReader(t);
		String line;
		while ((line = buf.readLine())!=null)
		{
			dispInfo(line.split(sep));
		}
		buf.close();
	}
	//Displays 
	public void dispInfo(String [] infos)
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(fields[i]+infos[i]);
		}
	}
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public String getLname() {
		return lname;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	//Getters and setters
	
	

}
