import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Sample extends Canvas implements KeyListener
{
    int x = 10, y = 10, dx = 10, dy = 10;

    public void Paint(Graphics g)
    {
        g.drawRect(x, y, dx, dy);
    }

    public void keyTyped(KeyEvent ke)
    {
        if (ke.getKeyChar() == 'a')
        {
            x--;
            x--;
        }
        else if (ke.getKeyChar() == 'd')
        {
            x++;
            x++;
        }
        else if (ke.getKeyChar() == 's')
        {
            y++;
            y++;
        }
        else if (ke.getKeyChar() == 'w')
        {
            y--;
            y--;
        }

        repaint();
    }

    public void keyPressed(KeyEvent ke) {}
    public void keyReleased(KeyEvent ke) {}

    public static void main(String args[])
    {
        Frame f = new Frame("Canvas");
        Sample myCanvas = new Sample();
        myCanvas.setSize(150, 150);
        f.add(myCanvas, BorderLayout.CENTER);
        myCanvas.requestFocus();
        myCanvas.addKeyListener(myCanvas);
        f.pack();
        f.setVisible(true);
    }
}
