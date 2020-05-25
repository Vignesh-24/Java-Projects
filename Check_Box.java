package calc;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
/*
*
*
Program for checkbox listener
*
*
*/
public class Check_Box extends JFrame implements ItemListener{

	static CheckboxGroup c;
	static Checkbox c1,c2,c3;
	static TextField t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc ob=new Calc();
		ob.setSize(400, 400);
		ob.setVisible(true);
		ob.setResizable(false);
		JPanel panel=new JPanel(new GridLayout(4,1));
		c=new CheckboxGroup();
		 c1=new Checkbox("Hi",c,false);
		c2=new Checkbox("Hii",c,false);
		c3=new Checkbox("Hiii",c,false);
		t=new TextField(15);
		panel.add(c1);
		panel.add(c2);
		panel.add(c3);
		panel.add(t);
		c1.addItemListener(ob);
		c2.addItemListener(ob);
		c3.addItemListener(ob);
		ob.add(panel);


	}
		public void itemStateChanged(ItemEvent ie) 
		{
			
		    if(ie.getStateChange() == 1)
			  t.setText((String)ie.getItem());
		    else
		    	t.setText(" ");
			
		}
		
	

}
