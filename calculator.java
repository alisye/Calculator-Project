import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame{
	
	private JTextField answerDisplay;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, add,
	sub, mul, div, equals, clear, negative;
	private double answer;
	private String fnum, snum;
	private boolean opPress = false, equalPress = false;
	private JPanel ControlPanel;
	private char op = ' ';
	
	public calculator() {
		
		super("Calculator");
		ControlPanel = new JPanel();
		ControlPanel.setBackground(Color.gray);
		ControlPanel.setLayout(new FlowLayout());
		
		answerDisplay = new JTextField(null, 18);
		answerDisplay.setEditable(false);
		ControlPanel.add(answerDisplay, BorderLayout.NORTH);
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		equals = new JButton("=");
		clear = new JButton("C");
		negative = new JButton("neg");
		
		ControlPanel.add(one); ControlPanel.add(two); ControlPanel.add(three);
		ControlPanel.add(four);ControlPanel.add(five);ControlPanel.add(six);
		ControlPanel.add(seven);ControlPanel.add(eight);ControlPanel.add(nine);
		ControlPanel.add(zero);ControlPanel.add(add);ControlPanel.add(sub);
		ControlPanel.add(mul);ControlPanel.add(div);ControlPanel.add(equals);
		ControlPanel.add(negative);ControlPanel.add(clear);
		
		Numbers n = new Numbers();
		Calc c = new Calc();
		
		one.addActionListener(n);
		two.addActionListener(n);
		three.addActionListener(n);
		four.addActionListener(n);
		five.addActionListener(n);
		six.addActionListener(n);
		seven.addActionListener(n);
		eight.addActionListener(n);
		nine.addActionListener(n);
		zero.addActionListener(n);
		add.addActionListener(c);
		sub.addActionListener(c);
		mul.addActionListener(c);
		div.addActionListener(c);
		equals.addActionListener(c);
		clear.addActionListener(c);
		negative.addActionListener(c);
		
		this.setContentPane(ControlPanel);
	}
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			if (src.equals(one)){
				if (opPress == false){
					if (fnum == null){
						fnum = "1";
					}else {
						fnum += "1";
					}
				}else {
					if (snum == null){
						snum = "1";
					}else {
						snum += "1";
					}
				}
			}else if (src.equals(two)){
				if (opPress == false){
					if (fnum == null){
						fnum = "2";
					}else {
						fnum += "2";
					}
				}else {
					if (snum == null){
						snum = "2";
					}else {
						snum += "2";
					}
				}
			}else if (src.equals(three)){
				if (opPress == false){
					if (fnum == null){
						fnum = "3";
					}else {
						fnum += "3";
					}
				}else {
					if (snum == null){
						snum = "3";
					}else {
						snum += "3";
					}
				}
			}else if (src.equals(four)){
				if (opPress == false){
					if (fnum == null){
						fnum = "4";
					}else {
						fnum += "4";
					}
				}else {
					if (snum == null){
						snum = "4";
					}else {
						snum += "4";
					}
				}
			}else if (src.equals(five)){
				if (opPress == false){
					if (fnum == null){
						fnum = "5";
					}else {
						fnum += "5";
					}
				}else {
					if (snum == null){
						snum = "5";
					}else {
						snum += "5";
					}
				}
			}else if (src.equals(six)){
				if (opPress == false){
					if (fnum == null){
						fnum = "6";
					}else {
						fnum += "6";
					}
				}else {
					if (snum == null){
						snum = "6";
					}else {
						snum += "6";
					}
				}
			}else if (src.equals(seven)){
				if (opPress == false){
					if (fnum == null){
						fnum = "7";
					}else {
						fnum += "7";
					}
				}else {
					if (snum == null){
						snum = "7";
					}else {
						snum += "7";
					}
				}
			}else if (src.equals(eight)){
				if (opPress == false){
					if (fnum == null){
						fnum = "8";
					}else {
						fnum += "8";
					}
				}else {
					if (snum == null){
						snum = "8";
					}else {
						snum += "8";
					}
				}
			}else if (src.equals(nine)){
				if (opPress == false){
					if (fnum == null){
						fnum = "9";
					}else {
						fnum += "9";
					}
				}else {
					if (snum == null){
						snum = "9";
					}else {
						snum += "9";
					}
				}
			}else {
				if (opPress == false){
					if (fnum == null){
						fnum = "0";
					}else {
						fnum += "0";
					}
				}else {
					if (snum == null){
						snum = "0";
					}else {
						snum += "0";
					}
				}
			}
			if (equalPress == false){
				if (opPress == false){
					answerDisplay.setText(fnum);
				}else {
					answerDisplay.setText(snum);
			}
		  }
	   }
	}
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			if (src.equals(add)){
				if (fnum == null){}
				else if (fnum != null && snum == null){
					opPress = true;
					op = '+';
				}else {}
			}
			if (src.equals(sub)){
				if (fnum == null){}
				else if (fnum != null && snum == null){
					opPress = true;
					op = '-';
				}else {}
			}
			if (src.equals(mul)){
				if (fnum == null){}
				else if (fnum != null && snum == null){
					opPress = true;
					op = '*';
				}else {}
			}
			if (src.equals(div)){
				if (fnum == null){}
				else if (fnum != null && snum == null){
					opPress = true;
					op = '/';
				}else {}
			}
			if (src.equals(equals)){
				if (fnum == null){}
				else if (fnum != null && snum == null){}
				else {
					equalPress = true;
					double d1;
					double d2;
					d1 = Double.parseDouble(fnum);
					d2 = Double.parseDouble(snum);
					
					switch(op){
					case '+': {answer = d1 + d2;
							break;}
					case '-': {answer = d1 - d2;
					        break;}
					case '*': {answer = d1 * d2;
					        break;}
					case '/': {answer = d1 / d2;
					         break;}
					}
					String ans = Double.toString(answer);
					answerDisplay.setText(ans);
				}
			}
			if (src.equals(clear)){
				answerDisplay.setText(null);
				snum = null;
				fnum = null;
				op = ' ';
				opPress = false;
				equalPress = false;
			}
			if (src.equals(negative)){
				
				if (fnum == null){}
				else if (fnum != null && snum == null){
					fnum = "-" + fnum;
					answerDisplay.setText(fnum);
				}
				else if (equalPress == true && snum != null){}
				else {
					snum = "-" + snum;
					answerDisplay.setText(snum);
				}
			}
		}
	}
}
