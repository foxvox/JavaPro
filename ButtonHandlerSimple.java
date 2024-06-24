import java.awt.*;
import java.awt.event.*;

// mouse event handling
public class Sample
{
    private Frame f;

    public void go()
    {

        f = new Frame("Button Test");
        Button b = new Button("눌러줘잉~");
        b.addActionListener(new ButtonHandler());
        f.add(b, "Center");
        f.pack();
        f.setVisible(true);
    }

    static class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            System.out.println("Javanuri Good");
        }
    }


    public static void main(String args[])
    {
        Sample s = new Sample();
        s.go();
    }
}
