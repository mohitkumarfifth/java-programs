import javax.swing.*;
class Form2
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JButton b1=new JButton("OK");
		JButton b2=new JButton("CLEAR");
		JLabel l1=new JLabel("REGISTRATION FORM");
		JLabel l2=new JLabel("NAME");
		JLabel l3=new JLabel("CLASS");
		JTextField tf1=new JTextField();
		JTextField tf2=new JTextField();
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(tf1);
		f.add(tf2);
		l1.setBounds(150,20,150,30);
		l2.setBounds(50,100,50,30);
		l3.setBounds(50,200,50,30);
		tf1.setBounds(150,100,200,30);
		tf2.setBounds(150,200,200,30);
		b1.setBounds(100,300,70,50);
		b2.setBounds(200,300,70,50);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}