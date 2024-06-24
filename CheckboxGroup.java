import java.awt.*;
import java.awt.event.*;

// mouse event handling
public class Sample implements ItemListener
{
    private Frame f;
    private Checkbox one, two, three;
    private CheckboxGroup cbg;

    public void go()
    {

        f = new Frame("Sample Checkbox");
        Button b = new Button("눌러줘잉~");
        b.addActionListener(new ButtonHandler());

        cbg = new CheckboxGroup();
        one = new Checkbox("대", cbg, true);
        two = new Checkbox("중", cbg, false);
        three = new Checkbox("소", cbg, false);
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
        String state = null;
        if (ie.getStateChange() == ItemEvent.SELECTED)
        {
            state = "선택됨";
        }
        System.out.println(ie.getItem() + " " + state);
    }

    static class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            System.out.println("윤은서 Good");
        }
    }


    public static void main(String args[])
    {
        Sample s = new Sample();
        s.go();
    }
}
