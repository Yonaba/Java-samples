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

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.JOptionPane;
import java.io.*;

public class data implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private float weight;
	
	public data()
	{
		name = "Unnammed";
		age = 0;
		weight = 0f;
	}
	
	public data(String pname,int page,float pweight)
	{
		name = pname;
		age = page;
		weight = pweight;
		
	}
	
	public void display()
	{
		JOptionPane.showMessageDialog(null, "name : "+name+"\nage : "+age+"\nweight : "+weight,"ID", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void binSerialize(String path) throws FileNotFoundException, IOException
	{
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(path));
		o.writeObject(this);
		o.flush();
		o.close();
	}
	
	public data binDeserialize(String path) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream o = new ObjectInputStream(new FileInputStream(path));
		data b = (data) o.readObject();
		o.close();
		return b;
	}
	public void xmlSerialize(String path) throws FileNotFoundException
	{
		XMLEncoder enc = new XMLEncoder(new FileOutputStream(path));
		enc.writeObject(this);
		enc.flush();
		enc.close();
	}
	public data xmlDeserialize(String path) throws FileNotFoundException
	{
		XMLDecoder dec = new XMLDecoder(new FileInputStream(path));
		data b = (data) dec.readObject();
		dec.close();
		return b;
	}
	//Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}
	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
