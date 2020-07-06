package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener{
	JFrame Jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton,plusButton,fourButton;
	JButton fiveButton,sixButton,minusButton,oneButton,twoButton;
	JButton threeButton,multiplicationButton,zeroButton,dotButton;
	JButton divisionButton,equalButton;
	JButton clearButton,removeButton;
	Boolean isOperatorClicked=false;
	Boolean isEqualClicked=false;
	String oldValue;
	String operator;
	float result;
	public Calculator() {
		 JFrame Jf = new JFrame("Calculator");
		 Jf.setLayout(null);
		 Jf.setSize(460, 500);
		 Jf.setLocation(300, 150);
		 displayLabel=new JLabel("0");
		 displayLabel.setBounds(20,30,370,70);
		 displayLabel.setBackground(Color.white);
		 displayLabel.setOpaque(true);
		 displayLabel.setForeground(Color.black);
		 displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		 Jf.add(displayLabel);
		 sevenButton = new JButton("7");
		 sevenButton.setBounds(30,130,60,60);
		 sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		 sevenButton.addActionListener(this);
		 Jf.add(sevenButton);
		 eightButton = new JButton("8");
		 eightButton.setBounds(110,130,60,60);
		 eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		 eightButton.addActionListener(this);
		 Jf.add(eightButton);
		 nineButton = new JButton("9");
		 nineButton.setBounds(190,130,60,60);
		 nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		 nineButton.addActionListener(this);
		 Jf.add(nineButton);
		 plusButton = new JButton("+");
		 plusButton.setBounds(270,130,60,60);
		 plusButton.setFont(new Font("Arial",Font.PLAIN,40));
		 plusButton.addActionListener(this);
		 Jf.add(plusButton);
		 fourButton = new JButton("4");
		 fourButton.setBounds(30,210,60,60);
		 fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		 fourButton.addActionListener(this);
		 Jf.add(fourButton);
		 fiveButton = new JButton("5");
		 fiveButton.setBounds(110,210,60,60);
		 fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		 fiveButton.addActionListener(this);
		 Jf.add(fiveButton);
		 sixButton = new JButton("6");
		 sixButton.setBounds(190,210,60,60);
		 sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		 sixButton.addActionListener(this);
		 Jf.add(sixButton);
		 minusButton = new JButton("-");
		 minusButton.setBounds(270,210,60,60);
		 minusButton.setFont(new Font("Arial",Font.PLAIN,40));
		 minusButton.addActionListener(this);
		 Jf.add(minusButton);
		 oneButton = new JButton("1");
		 oneButton.setBounds(30,290,60,60);
		 oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		 oneButton.addActionListener(this);
		 Jf.add(oneButton);
		 twoButton = new JButton("2");
		 twoButton.setBounds(110,290,60,60);
		 twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		 twoButton.addActionListener(this);
		 Jf.add(twoButton);
		 threeButton = new JButton("3");
		 threeButton.setBounds(190,290,60,60);
		 threeButton.setFont(new Font("Arial",Font.PLAIN,40)); 
		 threeButton.addActionListener(this);
		 Jf.add(threeButton);
		 multiplicationButton = new JButton("*");
		 multiplicationButton.setBounds(270,290,60,60);
		 multiplicationButton.setFont(new Font("Arial",Font.PLAIN,40));
		 multiplicationButton.addActionListener(this);
		 Jf.add(multiplicationButton);
		 zeroButton = new JButton("0");
		 zeroButton.setBounds(30,370,60,60);
		 zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		 zeroButton.addActionListener(this);
		 Jf.add(zeroButton);
		 dotButton = new JButton(".");
		 dotButton.setBounds(110,370,60,60);
		 dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		 dotButton.addActionListener(this);
		 Jf.add(dotButton);
		 divisionButton = new JButton("/");
		 divisionButton.setBounds(190,370,60,60);
		 divisionButton.setFont(new Font("Arial",Font.PLAIN,40));
		 divisionButton.addActionListener(this);
		 Jf.add(divisionButton);
		 equalButton = new JButton("=");
		 equalButton.setBounds(270,370,60,60);
		 equalButton.setFont(new Font("Arial",Font.PLAIN,40));
		 equalButton.addActionListener(this);
		 Jf.add(equalButton);
		 clearButton = new JButton("CLR");
		 clearButton.setBounds(350,370,60,60);
		 //clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
		 clearButton.addActionListener(this);
		 Jf.add(clearButton);
		 removeButton = new JButton("X");
		 removeButton.setBounds(350,290,60,60);
		 //removeButton.setFont(new Font("Arial",Font.PLAIN,40));
		 removeButton.addActionListener(this);
		 Jf.add(removeButton);
		 Jf.setVisible(true);
	}

public static void main(String[] args) {
	Calculator c= new Calculator();
	}


@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==sevenButton) {
		if(displayLabel.getText()=="0") {
			displayLabel.setText("7");
			}
		else if(isOperatorClicked) {
			displayLabel.setText("7");
			isOperatorClicked=false;
		}
		else if(isEqualClicked) {
			displayLabel.setText("7");
			isEqualClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
	}
	else if(e.getSource()==eightButton){
		if(displayLabel.getText()=="0") {
			displayLabel.setText("8");
			}
		else if(isOperatorClicked) {
			displayLabel.setText("8");
			isOperatorClicked=false;
		}
		else if(isEqualClicked) {
			displayLabel.setText("8");
			isEqualClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
	}
	else if(e.getSource()==nineButton){
		if(displayLabel.getText()=="0") {
			displayLabel.setText("9");
			}
		else if(isOperatorClicked) {
			displayLabel.setText("9");
			isOperatorClicked=false;
		}
		else if(isEqualClicked) {
			displayLabel.setText("9");
			isEqualClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
	}
	else if(e.getSource()==fourButton){
		if(displayLabel.getText()=="0") {
			displayLabel.setText("4");
			}
		else if(isOperatorClicked) {
			displayLabel.setText("4");
			isOperatorClicked=false;
		}
		else if(isEqualClicked) {
			displayLabel.setText("4");
			isEqualClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
	}
	else if(e.getSource()==fiveButton){
		if(displayLabel.getText()=="0") {
			displayLabel.setText("5");
			}
		else if(isOperatorClicked) {
			displayLabel.setText("5");
			isOperatorClicked=false;
		}
		else if(isEqualClicked) {
			displayLabel.setText("5");
			isEqualClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
	}
	else if(e.getSource()==sixButton){
		if(displayLabel.getText()=="0") {
			displayLabel.setText("6");
			}
		else if(isOperatorClicked) {
			displayLabel.setText("6");
			isOperatorClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
	}
	else if(e.getSource()==oneButton){
		if(displayLabel.getText()=="0") {
			displayLabel.setText("1");
			}
		else if(isOperatorClicked) {
			displayLabel.setText("1");
			isOperatorClicked=false;
		}
		else if(isEqualClicked) {
			displayLabel.setText("1");
			isEqualClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
	}
	else if(e.getSource()==twoButton){
		if(displayLabel.getText()=="0") {
			displayLabel.setText("2");
			}
		else if(isOperatorClicked) {
			displayLabel.setText("2");
			isOperatorClicked=false;
		}
		else if(isEqualClicked) {
			displayLabel.setText("2");
			isEqualClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
	}
	else if(e.getSource()==threeButton){
		if(displayLabel.getText()=="0") {
			displayLabel.setText("3");
			}
		else if(isOperatorClicked) {
			displayLabel.setText("3");
			isOperatorClicked=false;
		}
		else if(isEqualClicked) {
			displayLabel.setText("3");
			isEqualClicked=false;
		}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
	}
	else if(e.getSource()==zeroButton){
		if(displayLabel.getText()=="0") {
		displayLabel.setText("0");
		}
		else if(isOperatorClicked) {
			displayLabel.setText("0");
			isOperatorClicked=false;
		}
		else if(isEqualClicked) {
			displayLabel.setText("0");
			isEqualClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"0");
		}
		}
	else if(e.getSource()==dotButton){
		String dotLabel = displayLabel.getText();
		if(isEqualClicked) {
			displayLabel.setText("0.");
			isEqualClicked=false;
		}
		else if(isOperatorClicked) {
			displayLabel.setText("0.");
			isOperatorClicked=false;
		}
		else if(dotLabel.contains(".")) {
			displayLabel.setText(displayLabel.getText());
		}
		else if(displayLabel.getText()=="0") {
				displayLabel.setText("0.");
				}
	
			else {
					displayLabel.setText(displayLabel.getText()+".");
				}
		}
	else if(e.getSource()==removeButton) {
		displayLabel.setText(displayLabel.getText().substring(0, displayLabel.getText().length()-1));
		}
	else if(e.getSource()==clearButton) {
		displayLabel.setText("0");
		oldValue="0";
		}
	else if(e.getSource()==plusButton) {
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		operator="+";
		}
	else if(e.getSource()==minusButton) {
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		operator="-";
		}
	else if(e.getSource()==multiplicationButton) {
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		operator="*";
		}
	else if(e.getSource()==divisionButton) {
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		operator="/";
		}
	else if(e.getSource()==equalButton) {
		isEqualClicked=true;
		String newValue=displayLabel.getText();
		float oldValueF=Float.parseFloat(oldValue);
		float newValueF=Float.parseFloat(newValue);
		switch(operator) {
		case "+":
			result=oldValueF+newValueF;
			break;
		case "-":
			result=oldValueF-newValueF;
			break;
		case "*":
			result=oldValueF*newValueF;
			break;
		case "/":
			result=oldValueF/newValueF;
			break;
		}
		displayLabel.setText(result+"");
		
		}
	}
	
}