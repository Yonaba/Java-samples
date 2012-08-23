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

public class Motor extends Car{
	
	private String color; //new Extra field color 
	//default Constructor
	public Motor()
	{
		super();
		this.nbwheels = 2; //Correction of nbwheels
		this.setColor("red");		
	}
	//Intialization constructor using parameters
	public Motor(String pmark,String pmodel,String pserie,double pheight,double plength,double pwidth,int pnbwheels,String color)
	{
		super(pmark,pmodel,pserie,pheight,plength,pwidth,pnbwheels);
		this.setColor(color);
	}
	
	
	//Setter
	public void setColor(String color) {
		this.color = color;
	}
	//Getter
	public String getColor() {
		return color;
	}
	
}

