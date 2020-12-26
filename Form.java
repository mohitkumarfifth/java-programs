import java.awt.*;
class Form
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		Button b1=new Button("SIGN UP");
		Button b2=new Button("CLEAR");
		Label l1=new Label("REGISTRATION FORM");
		Label l2=new Label("NAME");
		Label l3=new Label("CLASS");
		Label l4=new Label("COURSE");
		Label l5=new Label("CONTACT");
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		TextField tf4=new TextField();
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		l1.setBounds(250,20,200,50);
		l2.setBounds(100,130,100,30);
		l3.setBounds(100,210,100,30);
		l4.setBounds(100,290,100,30);
		l5.setBounds(100,370,100,30);
		tf1.setBounds(300,130,200,40);
		tf2.setBounds(300,210,200,40);
		tf3.setBounds(300,290,200,40);
		tf4.setBounds(300,370,200,40);
		b1.setBounds(175,450,100,50);
		b2.setBounds(350,450,100,50);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}
}