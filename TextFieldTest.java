import java.awt.*;
import java.awt.event.*;
public class Sample
{
    private Frame f;
    private TextField tf;

    public void go()
    {
        f = new Frame("TextField Test");
        tf = new TextField(30);
        tf.setEchoChar('*');
        f.add(tf, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        Sample tft = new Sample();
        tft.go();
    }
}
