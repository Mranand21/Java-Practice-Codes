import java.applet.*;
import java.awt.*;
public class drawing extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.ORANGE);
                g.drawLine(20, 20, 500, 20);
		g.setColor(Color.BLUE);
                g.drawRect(20, 40, 200, 40);
		g.fillRect(300, 40, 200, 40);
		g.setColor(Color.RED);
		g.drawOval(20, 160, 200, 100);
		g.fillOval(300, 160, 200, 100);
	}
}
/*
<applet code="drawing.class" height="500" width="700" border="1">
</applet>
*/