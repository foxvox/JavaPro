import java.awt.*;
import java.awt.event.*;

// mouse event handling
public class Sample implements ItemListener
{
    private Frame f;
    private Checkbox one, two, three;

    public void go()
    {

        f = new Frame("Sample Checkbox");
        Button b = new Button("눌러줘잉~");
        b.addActionListener(new ButtonHandler());

        one = new Checkbox("Javanuri", true);
        two = new Checkbox("Javapool", false);
        three = new Checkbox("Javamall", false);
        one.addItemListener(this);
        two.addItemListener(this);
        three.addItemListener(this);
        f.setLayout(new FlowLayout());

        f.add(b, "Center");
        f.add(one);
        f.add(two);
        f.add(three);

        f.pack();
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        String state = "해제";
        if (ie.getStateChange() == ItemEvent.SELECTED)
        {
            state = "선택";
        }
        System.out.println(ie.getItem() + " " + state);
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
