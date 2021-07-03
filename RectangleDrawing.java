import java.awt.*;
import java.applet.*;
public class RectangleDrawing extends Applet
{
  public void paint(Graphics g)
  {
    g.setColor(Color.blue);
    g.drawRect(50, 80, 150, 100);
    g.setColor(Color.magenta);
    g.fillRect(230, 80, 150, 100);
  }
}
/*a <applet code="RectangleDrawing.class" width="400" height="400">
</applet>
*/