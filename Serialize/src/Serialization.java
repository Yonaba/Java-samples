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

// DAT/XML Serialization test

import java.io.FileNotFoundException;
import java.io.IOException;


public class Serialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  
	{
		data perso = new data("Roland",20,67.3f); //Create an object
		/*perso.binSerialize("file.dat"); //Serializes Object
		data p2 = new data(); //Inits another Object
		p2 = p2.binDeserialize("file.dat"); //Deserializes the first One in the second
		p2.setAge(32); //Mutates a field of the second obj
		p2.display(); //displays}*/
		perso.binSerialize("file.dat"); //Serializes Object
		data p2 = new data(); //Inits another Object
		p2 = p2.binDeserialize("file.dat"); //Deserializes the first One in the second
		p2.setAge(32); //Mutates a field of the second obj
		p2.display(); 
		
	}

}
