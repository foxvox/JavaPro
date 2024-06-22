import java.awt.*;
import java.awt.event.*;

public class TwoListen implements MouseMotionListener, MouseListener
{
    private Frame f;
    private TextField tf;

    public void go()
    {
        f = new Frame("한번에 두마리 토끼를 잡자");
        f.add(new Label("마우스 클릭과 끌기"), BorderLayout.NORTH);
        tf = new TextField(30);
        f.add(tf, BorderLayout.SOUTH);
        f.addMouseMotionListener(this);
        f.addMouseListener(this);
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public void mouseDragged(MouseEvent e)
    {
        String s = "마우스 끌기: X = " + e.getX() + " Y = " + e.getY();
        tf.setText(s);
    }

    public void mouseEntered(MouseEvent e)
    {
        String s = "마우스 들어옴";
        tf.setText(s);
    }

    public void mouseExited(MouseEvent e)
    {
        String s = "마우스 나감";
        tf.setText(s);
    }

    public void mouseMoved(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String args[])
    {
        TwoListen two = new TwoListen();
        two.go();
    }
}
