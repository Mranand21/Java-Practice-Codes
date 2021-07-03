import java.awt.*;  
import java.awt.event.*;  
public class TextAreaExample extends Frame implements ActionListener{  
Label l1,l2;  
TextArea area;  
Button b;  
TextAreaExample(){  
    l1=new Label();  
    l1.setBounds(50,50,100,30);  
    l2=new Label();  
    l2.setBounds(160,50,100,30);  
    area=new TextArea();  
    area.setBounds(20,100,300,300);  
    b=new Button("Count Words");  
    b.setBounds(100,400,100,30);  
    b.addActionListener(this);  
    add(l1);add(l2);add(area);add(b);  
    setSize(400,450);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String text=area.getText();  // fetching the text from textarea
    String words[]=text.split("\\s");  // extracting all spaces
    l1.setText("Words: "+words.length);  // total number os words
    l2.setText("Characters: "+text.length());  // number of characters
}  
public static void main(String[] args) {  
    new TextAreaExample();  
}  
}  
