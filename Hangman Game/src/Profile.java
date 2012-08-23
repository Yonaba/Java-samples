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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Profile implements Serializable
{
	/**
	 * 
	 */
		private String name;
	private String password;
	private int[] bestScore=new int[3];
	
	//Default Constructor
	@SuppressWarnings("unused")
	private Profile()
	{
		this.name = "Unnammed";
		this.password = "NoPass";
		for (int i:this.bestScore)
			this.bestScore[i]=0;
	}
	//Class Constructor
	public Profile(String name,String password)
	{
		this.name = name;
		this.password = password;
		for (int i:this.bestScore)
			this.bestScore[i] = 0;
	}
	
	// Serializer
	public void serialize() throws FileNotFoundException, IOException
	{
		String path = (this.getName()+this.getPassword().charAt(0)+".dat").toLowerCase();
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(path));
		o.writeObject(this);
		o.flush();
		o.close();
	}
	
	//deserializer
	public Profile deserialize(String path) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream o = new ObjectInputStream(new FileInputStream(path));
		Profile p = (Profile)o.readObject();
		o.close();
		return p;
	}
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public int[] getBestScore() {
		return bestScore;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setBestScore(int[] bestScore) {
		this.bestScore = bestScore;
	}	
	

	
	
}