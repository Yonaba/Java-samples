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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Anim extends JFrame 
{
	private JPanel MainPanel = new JPanel();
	private JPanel BallPanel = new JPanel();
	private JPanel ButtonPanel = new JPanel();
	private JButton Go = new JButton("Go");
	private JButton Stop = new JButton("Stop");	
	
	private Circle circle = new Circle();
	public Anim()
	{
		this.setTitle("Animated Ball - R. Yonaba");
		this.setSize(480,272);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		initFrame();
		this.setVisible(true);
	}
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.white);
	}
public void initFrame()
	{
		ButtonPanel.add(Go);
		ButtonPanel.add(Stop);			
		MainPanel.setLayout(new BorderLayout());
		MainPanel.add(BallPanel,BorderLayout.CENTER);
		MainPanel.add(ButtonPanel,BorderLayout.SOUTH);
		this.setContentPane(MainPanel);
	}
	
}

class Circle
{
	private int pX = (int)Math.random()*100;
	private int pY = (int)Math.random()*100;
	private int wd = 50;
	private int hg= 50;
	private Color col = Color.RED;
	public Circle(){};
	public Circle(int wd,int hg,Color col)
	{
		this.wd = wd;
		this.hg = hg;
		this.col = col;
	}
	public void move(int boundSX,int boundSY,int boundW,int boundH,JPanel p)
	{
		int x,y;		
		boolean moveLX=false,moveRX = true,moveLY = false,moveRY = true,
		onRX = false,onRY = false,onLX=false,onLY=false;
		while (true)
		{
			x = this.getpX();
			y = this.getpY();			
			//Out of Bounds ?
			onRX = (x>(boundW-this.getWd()));
			onRY = (y>(boundH-this.getHg()));
			onLX = (x<boundSX);
			onLY = (y<boundSY);
			//Sets move Vectors
			if ((onRX)&&(moveRX))
			{
				moveRX =false;
				moveLX = true;
			}
			if ((onLX)&&(moveLX))
			{
				moveLX = false;
				moveRX = true;
			}
			if ((onRY)&&(moveRY))
			{
				moveRY =false;
				moveLY = true;
			}
			if ((onLY)&&(moveLY))
			{
				moveLY = false;
				moveRY = true;
			}			
			//Where should this moves ?
			x = (moveRX)? x+=2:x;
			x = (moveLX)? x-=2:x;
			y = (moveRY)? y+=2:y;
			y = (moveLY)? y-=2:y;
			this.setpX(x);
			this.setpY(y);
			p.repaint();
			try {Thread.sleep(10);} 
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	//getters'n'setters
	public int getpX() {return pX;}
	public int getpY() {return pY;}
	public int getWd() {return wd;}
	public int getHg() {return hg;}
	public void setpX(int pX) {this.pX = pX;}
	public void setpY(int pY) {this.pY = pY;}
	public void setWd(int wd) {this.wd = wd;}
	public void setHg(int hg) {this.hg = hg;}
	public Color getCol() {return col;}
    public void setCol(Color col) {this.col = col;}
	}
