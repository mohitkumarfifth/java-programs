import javax.swing.*;
class Calc
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JTextField tf1=new JTextField();
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("+");
		JButton b5=new JButton("4");
		JButton b6=new JButton("5");
		JButton b7=new JButton("6");
		JButton b8=new JButton("-");
		JButton b9=new JButton("7");
		JButton b10=new JButton("8");
		JButton b11=new JButton("9");
		JButton b12=new JButton("*");
		JButton b13=new JButton(".");
		JButton b14=new JButton("0");
		JButton b15=new JButton("=");
		JButton b16=new JButton("/");
		JButton b17=new JButton("CLEAR");
		f.add(tf1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);		
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);		
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);		
		f.add(b15);
		f.add(b16);
		f.add(b17);
		tf1.setBounds(20,20,260,50);
		b1.setBounds(20,90,50,50);
		b2.setBounds(90,90,50,50);
		b3.setBounds(160,90,50,50);
		b4.setBounds(230,90,50,50);
		b5.setBounds(20,160,50,50);
		b6.setBounds(90,160,50,50);
		b7.setBounds(160,160,50,50);
		b8.setBounds(230,160,50,50);
		b9.setBounds(20,230,50,50);
		b10.setBounds(90,230,50,50);
		b11.setBounds(160,230,50,50);
		b12.setBounds(230,230,50,50);
		b13.setBounds(20,300,50,50);
		b14.setBounds(90,300,50,50);
		b15.setBounds(160,300,50,50);
		b16.setBounds(230,300,50,50);
		b17.setBounds(20,370,260,30);
		f.setSize(320,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}