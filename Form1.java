import java.awt.*;
class Form1
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		Button b1=new Button("SUBMIT");
		Button b2=new Button("CLEAR");
		Label l1=new Label("REGISTRATION FORM");
		Label l2=new Label("NAME:");
		Label l3=new Label("CLASS:");
		Label l4=new Label("MOBILE NO.:");
		Label l5=new Label("ADDRESS:");
		Label l6=new Label("COMMENT:");
		Label l7=new Label("PHOTO");
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		TextArea ta1=new TextArea();
		TextArea ta2=new TextArea();
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(ta1);
		f.add(ta2);
		l1.setBounds(300,20,200,50);
		l2.setBounds(100,130,200,30);
		l3.setBounds(100,210,200,30);
		l4.setBounds(100,290,200,30);
		l5.setBounds(100,370,200,30);
		l6.setBounds(100,470,200,30);
		l7.setBounds(550,130,250,250);
		tf1.setBounds(300,130,200,50);
		tf2.setBounds(300,210,200,50);
		tf3.setBounds(300,290,200,50);
		ta1.setBounds(300,370,200,50);
		ta2.setBounds(300,470,200,50);
		b1.setBounds(175,550,100,50);
		b2.setBounds(400,550,100,50);
		f.setSize(800,800);
		f.setLayout(null);
		f.setVisible(true);	
	}
}