import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class mainclass extends JFrame implements ActionListener {
	Connection con=null;ResultSet res=null;
	Statement stmt=null;
	JButton b1;JLabel j1,j2,j3,j4,j5,j6,j7;JTextField t1,t2,t3,t4,t5,t6;JPanel p;
    mainclass()
    {
    	j1=new JLabel("Host");j2=new JLabel("Opponent");
    	j3=new JLabel("Runs Scored");j4=new JLabel("Runs Conceded");
    	j5=new JLabel("Balls Played");j6=new JLabel("Balls Bowled");j7=new JLabel();
    	t1=new JTextField();t2=new JTextField();t3=new JTextField();t4=new JTextField();t5=new JTextField();
    	t6=new JTextField();
    	b1=new JButton("Get Runrate");
    	p=new JPanel(new GridLayout(7,2,10,10));
    	p.add(j1);p.add(t1);p.add(j2);p.add(t2);p.add(j3);p.add(t3);p.add(j4);p.add(t4);p.add(j5);
    	p.add(t5);p.add(j6);p.add(t6);p.add(b1);p.add(j7);
    	add(p,BorderLayout.CENTER);
    	b1.addActionListener(this);
    }
	public static void main(String[] args) 
	{
		mainclass m=new mainclass();
		m.setTitle("Runrate");
		m.setSize(500, 500);
		m.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		int runs=0,runc=0,ballp=0,ballb=0,runs1=0,runc1=0,ballp1=0,ballb1=0,flag=0;
		String host,opp;
		if(a.getSource()==b1) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/runrate", "root", "lufi2412");
			host=t1.getText();opp=t2.getText();
			runs=Integer.parseInt(t3.getText());
			runc=Integer.parseInt(t4.getText());
			ballp=Integer.parseInt(t5.getText());
			ballb=Integer.parseInt(t6.getText());
			runs1=Integer.parseInt(t4.getText());
			runc1=Integer.parseInt(t3.getText());
			ballp1=Integer.parseInt(t6.getText());
			ballb1=Integer.parseInt(t5.getText());
			if(runs>runc)
				flag=1;
			stmt=con.createStatement();
			res=stmt.executeQuery("Select * from runcalc where Name='"+host+"'");
			res.next();
			runs=runs+res.getInt("run_scored");runc+=res.getInt("run_conceded");
			ballp+=res.getInt("ball_played");
			ballb+=res.getInt("ball_bowled");
			double r1=((runs/(double)ballp)*6)-((runc/(double)ballb)*6);
			stmt=con.createStatement();
			stmt.executeUpdate("Update runcalc set run_scored="+runs+",run_conceded="+runc+",ball_played="+ballp+",ball_bowled="+ballb+",runrate="+r1+" where Name='"+host+"'");
			stmt=con.createStatement();
			res=stmt.executeQuery("Select * from runcalc where Name='"+opp+"'");
			res.next();
			runs1=runs1+res.getInt("run_scored");runc1+=res.getInt("run_conceded");
			ballp1+=res.getInt("ball_played");
			ballb1+=res.getInt("ball_bowled");
			double r2=((runs1/(double)ballp1)*6)-((runc1/(double)ballb1)*6);
			stmt=con.createStatement();
			stmt.executeUpdate("Update runcalc set run_scored="+runs1+",run_conceded="+runc1+",ball_played="+ballp1+",ball_bowled="+ballb1+",runrate="+r2+" where Name='"+opp+"'");
			if(flag==0) {
				stmt=con.createStatement();
				res=stmt.executeQuery("select * from points_table where Name='"+opp+"'");res.next();
				stmt.executeUpdate("update points_table set matches="+(res.getInt("matches")+1)+",points="+(res.getInt("points")+2)+",runrate="+r2+" where Name='"+opp+"'");res=null;
				res=stmt.executeQuery("select * from points_table where Name='"+host+"'");res.next();
				stmt.executeUpdate("update points_table set matches="+(res.getInt("matches")+1)+",runrate="+r1+" where Name='"+host+"'");
				}
			else {
				res=stmt.executeQuery("select * from points_table where Name='"+host+"'");res.next();
				stmt=con.createStatement();
				stmt.executeUpdate("update points_table set matches="+(res.getInt("matches")+1)+",points="+(res.getInt("points")+2)+",runrate="+r1+" where Name='"+host+"'");res=null;
				res=stmt.executeQuery("select * from points_table where Name='"+opp+"'");res.next();
				stmt.executeUpdate("update points_table set matches="+(res.getInt("matches")+1)+",runrate="+r2+" where Name='"+opp+"'");
				}
		    j7.setText("Updated");
		    
		   
		}catch(Exception e)
		{
			System.out.println(e);
			JOptionPane.showMessageDialog(this,"Error");
		}
	   }
	}
}
