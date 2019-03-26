import java.awt.*;
import java.awt.event.*;
class calculator2 extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	Label l1;
	TextField t1;
	calculator2()
	{
		this.setLayout(null);
		l1=new Label("CALCULATOR");
		l1.setBounds(250,50,100,50);
		this.add(l1);
		t1=new TextField();
		t1.setBounds(30,150,200,50);
		this.add(t1);
		b1=new Button("7");
		b1.setBounds(20,200,40,30);
		this.add(b1);
		b1.addActionListener(this);
		b2=new Button("8");
		b2.setBounds(70,200,40,30);
		this.add(b2);
		b2.addActionListener(this);
		b3=new Button("9");
		b3.setBounds(120,200,40,30);
		this.add(b3);
		b3.addActionListener(this);
		b4=new Button("8");
		b4.setBounds(170,200,40,30);
		this.add(b4);
		b4.addActionListener(this);
		show();
		setSize(600,600);	
	}
			
	public  void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
	                  {
	//	int a=Integer.parseInt(b1.getText());
		t1.show("7");
		}
	}
	public static void main (String s[])
	{
		new calculator2();
	}
}