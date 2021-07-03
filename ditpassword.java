import java.awt.event.*;
import javax.swing.*;
public class ditpassword extends JFrame implements ActionListener
{​​​​​​
JLabel l1,l2;
JTextField t1;
JButton b1,b2;
JPasswordField tp;
ditpassword()
{​​​​​​
l1=new JLabel("Username");
l2=new JLabel("Password");
t1=new JTextField();
tp=new JPasswordField();
l1.setBounds(50,50,150,20);
t1.setBounds(150,50,150,20);
l2.setBounds(50,100,150,20);
tp.setBounds(150,100,150,20);
b1=new JButton("Login");
b2=new JButton("clear");
b1.setBounds(100,200,95,30);
b1.addActionListener(this);
b2.setBounds(200,200,95,30);
b2.addActionListener(this);
add(b1);
add(b2);
add(t1);
add(tp);
add(l1);
add(l2);
}​​​​​​
public static void main(String args[])
{​​​​​​
ditpassword f=new ditpassword();
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}​​​​​​
public void actionPerformed(ActionEvent e)
{​​​​​​
if(e.getSource()==b1)
{​​​​​​
String str = t1.getText();
String p=new String(tp.getPassword());
if(str.equals("dit")&& p.equals("313"))
{​​​​​​
JOptionPane.showMessageDialog(this,"Correct Login");
}​​​​​​
else
JOptionPane.showMessageDialog(this,"Try again");
}​​​​​​
if(e.getSource()==b2)
{​​​​​​
t1.setText(" ");
tp.setText(" ");
}​​​​​​
}​​​​​​
}​​​​​​