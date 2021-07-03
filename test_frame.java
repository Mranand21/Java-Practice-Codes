import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class test_frame extends Frame implements ActionListener
{
	Button b1;
	TextField t1;
	test_frame()
	{
		b1=new Button("Click");
		t1=new TextField();
		t1.setBounds(50,100,100,30);
		b1.setBounds(50,150,100,30);
		b1.addActionListener(this);
		add(t1);
		add(b1);
	}
public void actionPerformed(ActionEvent e)
{
	t1.setText("hello");
}

	

	public static void main(String ar[])
	{
		test_frame tf=new test_frame();
		tf.setSize(300,300);
		tf.setLayout(null);
		tf.setVisible(true);
	}

}
		