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

// A bingo card. Nothing more...
import javax.swing.*;
import java.awt.*;

public class Bingo extends JFrame
{



	JLabel B = new JLabel(" ");
	JLabel B1 = new JLabel("B");
	JLabel B2 = new JLabel("I");
	JLabel B3 = new JLabel("N");
	JLabel B4 = new JLabel("G");
	JLabel B5 = new JLabel("O");


	JLabel BB = new JLabel("L");
	JLabel BB2 = new JLabel("e");
	JLabel BB3 = new JLabel("t");
	JLabel BB4 = new JLabel("'");
	JLabel BB5 = new JLabel("s");




	JButton a = new JButton("5");
	JButton b = new JButton("11");
	JButton c = new JButton("13");
	JButton d = new JButton("21");
	JButton e = new JButton("25");
	JButton f = new JButton("16");
	JButton g = new JButton("10");
   	JButton h = new JButton("8");
   	JButton i = new JButton("1");
   	JButton j = new JButton("4");
	JButton k = new JButton("3");
	JButton l = new JButton("7");
	JButton m = new JButton("Free");
	JButton n = new JButton("19");
	JButton o = new JButton("20");
	JButton p = new JButton("15");
	JButton q = new JButton("2");
   	JButton r = new JButton("6");
   	JButton s = new JButton("9");
	JButton t = new JButton("14");
	JButton u = new JButton("17");
	JButton v = new JButton("18");
	JButton w = new JButton("22");
	JButton x = new JButton("24");
	JButton y = new JButton("23");





	JLabel C = new JLabel(" ");
	JLabel C1 = new JLabel("B");
	JLabel C2 = new JLabel("I");
	JLabel C3 = new JLabel("N");
	JLabel C4 = new JLabel("G");
	JLabel C5 = new JLabel("O");

	public Bingo()
	{
		super("John Vinson Go  a.k.a vinson77 ");
		setSize(300,300);

		JPanel paneA = new JPanel();
		paneA.setLayout(new GridLayout(1,6));
		paneA.add(B);
		paneA.add(B1);
		paneA.add(B2);
		paneA.add(B3);
		paneA.add(B4);
		paneA.add(B5);
		add(paneA, BorderLayout.NORTH);//To set this Label Above
								   	   //the Number's GridLayout.


		JPanel paneB = new JPanel();
		paneB.setLayout(new GridLayout(5,1));
		paneB.add(BB);
		paneB.add(BB2);
		paneB.add(BB3);
		paneB.add(BB4);
		paneB.add(BB5);
		add(paneB, BorderLayout.WEST);//To set this Label Before
								   	   //the Number's GridLayout.





		JPanel pane = new JPanel();
		pane.setLayout(new GridLayout(5,5));
		pane.add(a);pane.add(b);pane.add(c);pane.add(d);pane.add(e);
		pane.add(f);pane.add(g);pane.add(h);pane.add(i);pane.add(j);
		pane.add(k);pane.add(l);pane.add(m);pane.add(n);pane.add(o);
		pane.add(p);pane.add(q);pane.add(r);pane.add(s);pane.add(t);
		pane.add(u);pane.add(v);pane.add(w);pane.add(x);pane.add(y);


		add(pane, BorderLayout.CENTER);//To set the Buttons that is being contained
									   //in the GridLayout to the East Potion.

		JPanel paneC = new JPanel();
		paneC.setLayout(new GridLayout(1,6));
		paneC.add(C);
		paneC.add(C1);
		paneC.add(C2);
		paneC.add(C3);
		paneC.add(C4);
		paneC.add(C5);
		add(paneC, BorderLayout.SOUTH);//To set the Label BINGO below other Layouts.

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack(); // to compact the size of the window to the actual size of the contents.



	}
	public static void main(String[] args)
	{
		Bingo zz = new Bingo();
	}
}