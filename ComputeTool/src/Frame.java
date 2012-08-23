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
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Frame extends JFrame 
{
	//computing data
	private double Ans = 0;
	private boolean mayOperate = false;
	private boolean mayClean = false;
	private String Op = ""; 
	
	private JPanel Floor = new JPanel(); //Main Panel
	private JLabel Output = new JLabel("0"); //App Screen Panel
	
	private JPanel FuncPanel = new JPanel(); //Func Panel
	private final String[] FuncT = {"1/x","sqrt x","x^y","%","+/-"};
	private JButton[] FuncKeys = new JButton[FuncT.length];
	
	private JPanel KeysPanel = new JPanel(); 
	private final String[] symbols = {"7","8","9","4","5","6","1","2","3",".","0","="};
	private JButton[] Keys = new JButton[symbols.length]; 
	
	private JPanel OperatPanel = new JPanel();
	private final String[] text = {"C","/","x","-","+"};
	private JButton[] Opt = new JButton[text.length];
	
	public Frame()
	{
		//Sets App Main Frame Parameters 
		this.setTitle("CalcTool - R. Yonaba");
		this.setSize(325,250);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Floor.setLayout(new BorderLayout());
		initScreen();			
		initKeys();
		initOperators();
		initFunc();
		this.setContentPane(Floor);		
		//Displays App Main Frame
		this.setVisible(true);
	}
	
	private void initFunc()
	{
		FuncPanel.setPreferredSize(new Dimension(75,200));
		for (int i=0;i<FuncT.length;i++)
		{
			FuncKeys[i]= new JButton(FuncT[i]);
			FuncKeys[i].setPreferredSize(new Dimension(70,30));
			FuncPanel.add(FuncKeys[i]);
			
		}
		FuncKeys[0].addActionListener(new FuncListener());
		FuncKeys[1].addActionListener(new FuncListener());
		FuncKeys[1].addActionListener(new OpListener());
		FuncKeys[2].addActionListener(new OpListener());
		FuncKeys[3].addActionListener(new FuncListener());
		FuncKeys[4].addActionListener(new FuncListener());
		Floor.add(FuncPanel,BorderLayout.WEST);
	}
	
	private void initScreen()
	{
		
		Font Arial = new Font("Arial", Font.BOLD,20);
		Output.setFont(Arial);
		Output.setHorizontalAlignment(JLabel.RIGHT);
		Output.setPreferredSize(new Dimension(250,30));
		Output.setBorder(BorderFactory.createLineBorder(Color.BLACK ));		
		Floor.add(Output,BorderLayout.NORTH);
	}
	private void initKeys()
	{
		KeysPanel.setPreferredSize(new Dimension(200,200));
		for (int i=0;i<symbols.length;i++)
		{
			Keys[i]= new JButton(symbols[i]);
			if (!(symbols[i].equals("="))) 
				Keys[i].addActionListener(new KeyListener());
			else
				Keys[i].addActionListener(new EqualListener());
			Keys[i].setPreferredSize(new Dimension(50,40));
			KeysPanel.add(Keys[i]);
			
		}	
				
		Floor.add(KeysPanel,BorderLayout.CENTER);
	}
	private void initOperators()
	{
		OperatPanel.setPreferredSize(new Dimension(50,200));
		for (int i=0;i<text.length;i++)
		{
			Opt[i] = new JButton(text[i]);
			if (i!=0)
				Opt[i].addActionListener(new OpListener());
			else 
				Opt[i].addActionListener(new ResetListener());
			Opt[i].setPreferredSize(new Dimension(45,30));
			OperatPanel.add(Opt[i]);			
		}
		Floor.add(OperatPanel,BorderLayout.EAST);
	}
	private void setDot()
	{
		boolean isDec = false;
		for (char i:Output.getText().toCharArray())		
		{
			if (i=='.') 		
				isDec = true;
		}
		Keys[9].setEnabled((isDec)? false:true);
	}
	private void compute()
	{
		if (Op.equals("+")) 
		{
			Ans = Ans + Double.valueOf(Output.getText());
			Output.setText(String.valueOf(Ans));			
		}
		if (Op.equals("-"))
		{
			Ans = Ans - Double.valueOf(Output.getText());
			Output.setText(String.valueOf(Ans));
		}
		if (Op.equals("x"))
		{
			Ans = Ans * Double.valueOf(Output.getText());
			Output.setText(String.valueOf(Ans));
		}
		if (Op.equals("/"))
		{
			try{
				Ans = Ans/(Double.valueOf(Output.getText()));
				Output.setText(String.valueOf(Ans));
			}
			catch (ArithmeticException E) {Output.setText("0");}
		}
		if (Op.equals("1/x"))
		{
			
			Ans = ((Double) 1D/Double.valueOf(Output.getText()).doubleValue());
			Output.setText(String.valueOf(Ans));
		}
		if (Op.equals("sqrt x"))
		{
			Ans =  Math.sqrt(Double.valueOf(Output.getText()).doubleValue());
			Output.setText(String.valueOf(Ans));
		}	
		if (Op.equals("%"))
		{
			Ans =  (Double.valueOf(Output.getText()).doubleValue())/100;
			Output.setText(String.valueOf(Ans));
		}
		if (Op.equals("+/-"))
		{
			
			Ans =  (Double.valueOf(Output.getText()).doubleValue())*(-1);
			Output.setText(String.valueOf(Ans));
		}
		if (Op.equals("x^y"))
		{
			
			Ans =  Math.pow(Ans, Double.valueOf(Output.getText()).doubleValue());
			Output.setText(String.valueOf(Ans));
		}
		setDot();
	}
	
	class KeyListener implements ActionListener	{

	@Override
	public void actionPerformed(ActionEvent event) {					
		String str = ((JButton)event.getSource()).getText();			
		if (mayClean)
		{
			mayClean= false;
		}
		else				
		{
			if (!(Output.getText().equals("0"))) str = Output.getText()+str;
		}
		Output.setText(str);
		setDot();
	}
}
	
	class OpListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {	
	if (mayOperate)
		compute();
	else
	{
		Ans = Double.valueOf(Output.getText());
		mayOperate = true;
	}	
	Op = ((JButton)arg0.getSource()).getText();
	mayClean =true;	
	}
	
}

	class ResetListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
	mayOperate = false;
	mayClean = true;
	Op="";
	Ans=0;
	Output.setText("0");
	setDot();	
	}
	
}

	class EqualListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
	compute();
	mayClean = true;
	mayOperate = false;		
	}
	
}
	
	class FuncListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
		Op = ((JButton)arg0.getSource()).getText();
		compute();
		mayClean = true;
			
		}
		
	}
	

}

