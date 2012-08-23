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

import java.util.*;

public class Car {
	protected String mark;
	protected String model;
	protected String serie;
	protected double height;
	protected double length;
	protected double width;
	protected int nbwheels;

	//Default Class Constructor
	public Car()
	{
		mark = "Unknown";
		model = "Unknown";
		serie = "Unknown";
		height = 1.5;
		length = 3.0;
		width = 1.3;
		nbwheels = 4;
	}
	//Class Constructor
	public Car(String pmark,String pmodel,String pserie,double pheight,double plength,double pwidth,int pnbwheels)
	{
		mark = pmark;
		model = pmodel;
		serie = pserie;
		height = pheight;
		length = plength;
		width= pwidth;
		nbwheels = pnbwheels;
		
	}	
	//prints All car Attr
	public void getAll()
	{
		System.out.println("Mark: "+mark);
		System.out.println("Model: "+model);
		System.out.println("Serie: "+serie);
		System.out.println("Height: "+height);
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("NbWheels: "+nbwheels);		
	}
	//sets All car Attr
	public void setAll()
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Set Mark: ");
		mark = read.nextLine();
		System.out.println("Set Model: ");
		model = read.nextLine();
		System.out.println("Set Serie: ");
		serie = read.nextLine();
		System.out.println("Set Height: ");
		height = read.nextDouble();
		System.out.println("Set Length: ");
		length = read.nextDouble();
		System.out.println("Set Width: ");
		width = read.nextDouble();
		System.out.println("Set Nbwheels: ");
		nbwheels = read.nextInt();
		
	}
	//Getters
	public String getMark() {
		return mark;
	}
	public String getModel() {
		return model;
	}
	public String getSerie() {
		return serie;
	}
	public double getHeight() {
		return height;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public int getNbwheels() {
		return nbwheels;
	}
	//Setters
	public void setMark(String mark) {
		this.mark = mark;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setNbwheels(int nbwheels) {
		this.nbwheels = nbwheels;
	}
	
	
}
