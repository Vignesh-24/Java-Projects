package justlearn1;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class graphics  {
	
	public static void main(String args[])
	{
		JFrame f=new JFrame("LOGIN");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
		JLabel l1=new JLabel("Username :");
		JLabel l2=new JLabel("Password :");
		JTextField t=new JTextField(10);t.setBounds(250, 100, 150, 40);
		JPasswordField t1=new JPasswordField(10);t1.setBounds(250,180,150,40);
		t1.setEchoChar('*');
		t1.addActionListener(new submit());
		l1.setBounds(100, 100, 100, 50);
		l2.setBounds(100,180,100,50);
		t.setBackground(Color.white);
		t1.setBackground(Color.white);
		f.add(l1);
		f.add(t);
		f.add(l2);
		f.add(t1);
		Checkbox c=new Checkbox("Agree to terms and conditions",true);
		c.setBounds(100,250,200,50);
		f.add(c);
		Scrollbar s=new Scrollbar(Scrollbar.VERTICAL);s.setBackground(Color.white);
		s.setBounds(550,40,20,500);
		f.add(s);
		JButton b=new JButton("Submit");
		b.setBounds(150,400,200,50 );
		b.setBackground(Color.red);
		f.add(b);
		f.setBackground(Color.DARK_GRAY);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton Jb=new JButton("Signup");
		Jb.setBounds(300, 400, 100, 100);
		f.add(Jb);
		b.addActionListener(new submit());
		Jb.addActionListener(new submit());
	
		
	}
}
class submit implements ActionListener
{
	String password ="vicky";
	public void actionPerformed(ActionEvent e)
		{
		JPasswordField input=(JPasswordField) e.getSource();
		String pass=new String(input.getPassword());
		if(pass.equals(password))
		{
			 JFrame f1=new JFrame("Welcome Page");
			 f1.setVisible(true);
			 f1.setSize(500,500);
			 f1.setLayout(new FlowLayout());
			 JLabel l=new JLabel("hs");
			 f1.add(l);
			 Draw d1=new Draw();
			 f1.add(d1);
			 //JPanel panel = new JPanel();
			 //panel.setSize(400,400);
			 //panel.setBackground(Color.pink);
			 //f1.add(panel);
		
		}
	   else
	   {
		JOptionPane.showMessageDialog(null, "Incorrect Password");
	   }
				
	}
}

