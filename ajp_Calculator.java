import java.awt.*;
import java.awt.event.*;
class Cal_des extends Frame implements ActionListener
	{
	Panel p1,p2;
	int dec=0;
	String s1,operation,s2;
	Double x,y;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	Button add,sub,mul,div,per,sqt,pwr;
	Button c,ce,del,sin,cos,tan,eql,pnt;
	TextField t;
	Cal_des()
	{
		p1=new Panel();
		p2=new Panel();
		Frame f=new Frame("calculator");
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		f.add(p1,gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		f.add(p2,gbc);
		t=new TextField(20);
		p1.setLayout(new FlowLayout());
		p1.add(t);
		f.setVisible(true);
		f.setSize(500,500);
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b0=new Button("0");
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		per=new Button("%");
		sqt=new Button("SQRT");
		pwr=new Button("^");
		c=new Button("C");
		ce=new Button("CE");
		del=new Button("<=");
		sin=new Button("SIN");
		cos=new Button("COS");
		tan=new Button("TAN");
		eql=new Button("=");
		pnt=new Button(".");
		GridLayout g = new GridLayout(6,4,10,20);
		p2.setLayout(g);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b0);
		p2.add(add);
		p2.add(sub);
		p2.add(mul);
		p2.add(div);
		p2.add(per);
		p2.add(sqt);
		p2.add(pwr);
		p2.add(c);
		p2.add(ce);
		p2.add(del);
		p2.add(sin);
		p2.add(cos);
		p2.add(tan);
		p2.add(eql);
		p2.add(pnt);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		per.addActionListener(this);
		sqt.addActionListener(this);
		pwr.addActionListener(this);
		c.addActionListener(this);
		ce.addActionListener(this);
		del.addActionListener(this);
		sin.addActionListener(this);
		cos.addActionListener(this);
		tan.addActionListener(this);
		eql.addActionListener(this);
		pnt.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b0)
		{
			s1=t.getText()+"0";
			t.setText(s1);
		}
		if(ae.getSource()==b1)
		{
			s1=t.getText()+"1";
			t.setText(s1);
		}
		if(ae.getSource()==b2)
		{
			s1=t.getText()+"2";
			t.setText(s1);
		}
		if(ae.getSource()==b3)
		{
			s1=t.getText()+"3";
			t.setText(s1);
		}
		if(ae.getSource()==b4)
		{
			s1=t.getText()+"4";
			t.setText(s1);
		}
		if(ae.getSource()==b5)
		{
			s1=t.getText()+"5";
			t.setText(s1);
		}
		if(ae.getSource()==b6)
		{
			s1=t.getText()+"6";
			t.setText(s1);
		}
		if(ae.getSource()==b7)
		{
			s1=t.getText()+"7";
			t.setText(s1);
		}
		if(ae.getSource()==b8)
		{
			s1=t.getText()+"8";
			t.setText(s1);
		}
		if(ae.getSource()==b9)
		{
			s1=t.getText()+"9";
			t.setText(s1);
		}
		if(ae.getSource()==add)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			t.setText("");
			operation="add";
		}
		if(ae.getSource()==sub)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			t.setText("");
			operation="sub";
		}
		if(ae.getSource()==mul)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			t.setText("");
			operation="mul";
		}
		if(ae.getSource()==div)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			t.setText("");
			operation="div";
		}
		if(ae.getSource()==per)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			t.setText("");
			operation="per";
		}
		if(ae.getSource()==sqt)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			t.setText("");
			y=Math.sqrt(x);
			s2=Double.toString(y);
			t.setText(s2);
		}
		if(ae.getSource()==pwr)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			t.setText("");
			operation="pwr";
		}
		if(ae.getSource()==c)
		{
			t.setText("");
		}
		if(ae.getSource()==ce)
		{
			t.setText("");
			s1="";
			operation="";
			s2="";
		}
		if(ae.getSource()==del)
		{
			s1=t.getText();
			StringBuilder sbf=new StringBuilder(s1);
			sbf.deleteCharAt((s1.length())-1);
			s2=sbf.toString();
			t.setText(s2);
		}
		if(ae.getSource()==sin)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			y=Math.sin(x);
			s2=Double.toString(y);
			t.setText(s2);
		}
		if(ae.getSource()==cos)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			y=Math.cos(x);
			s2=Double.toString(y);
			t.setText(s2);
		}
		if(ae.getSource()==tan)
		{
			s1=t.getText();
			x=Double.parseDouble(s1);
			y=Math.tan(x);
			s2=Double.toString(y);
			t.setText(s2);
		}
		if(ae.getSource()==eql)
		{
			if(operation=="add")
			{
				s2=t.getText();
				y=Double.parseDouble(s2);
				x=x+y;
				s2=Double.toString(x);
				t.setText(s2);
			}
			else if(operation=="sub")
			{
				s2=t.getText();
				y=Double.parseDouble(s2);
				x=x-y;
				s2=Double.toString(x);
				t.setText(s2);
			}
			else if(operation=="mul")
			{
				s2=t.getText();
				y=Double.parseDouble(s2);
				x=x*y;
				s2=Double.toString(x);
				t.setText(s2);
			}
			else if(operation=="div")
			{
				s2=t.getText();
				y=Double.parseDouble(s2);
				x=x/y;
				s2=Double.toString(x);
				t.setText(s2);
			}
			else if(operation=="per")
			{
				s2=t.getText();
				y=Double.parseDouble(s2);
				x=x%y;
				s2=Double.toString(x);
				t.setText(s2);
			}
			else if(operation=="pwr")
			{
				s2=t.getText();
				y=Double.parseDouble(s2);
				x=Math.pow(x,y);
				s2=Double.toString(x);
				t.setText(s2);
			}
		}
		if(ae.getSource()==pnt)
		{
			if(dec==0)
				{
				s1=t.getText();
				s2=s1+".";
				t.setText(s2);
				dec++;
				}		
		}
	}
}
class ajp_Calculator
{
	public static void main(String[] args) {
	Cal_des c=new Cal_des();
	}
}	