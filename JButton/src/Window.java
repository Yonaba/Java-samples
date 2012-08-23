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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Window extends JFrame implements ActionListener
{
	private JPanel panel = new JPanel();
	private JPanel ButtonPanel = new JPanel();
	private JButton buttonOk = new JButton("Ok");
	private JButton buttonExit = new JButton("Exit");
	private JLabel label = new JLabel("Just Click on any Button!");
	private int countOk = 0;
	private int countExit = 0;
	public Window(int w,int h)
	{
		this.setSize(w,h);
		this.setTitle("Frame and Button");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new BorderLayout());
		
		buttonOk.addActionListener(this);
		buttonExit.addActionListener(this);
		
		Font FontArial = new Font("Tahoma",Font.PLAIN,12);
		label.setFont(FontArial);
		label.setForeground(Color.RED);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		ButtonPanel.add(buttonOk);
		ButtonPanel.add(buttonExit);
		panel.add(ButtonPanel,BorderLayout.SOUTH);
		panel.add(label,BorderLayout.NORTH);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		countOk = (arg0.getSource()==buttonOk) ? ++countOk:countOk;
		countExit = (arg0.getSource()==buttonExit) ? ++countExit:countExit;		
		label.setText("You clicked "+this.countOk+" times on \"Ok and "+this.countExit+" times on \"Exit");
		
	}
}
