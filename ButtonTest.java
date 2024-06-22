import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTest extends Frame implements WindowListener
{
    public ButtonTest(String str)
    {
        super(str);
        addWindowListener(this);
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e)
    {
        setVisible(false); // Frame을 화면에서 없앤다.
        dispose();  // 모든 자원을 반납한다.
        System.exit(0); // 프로그램을 종료한다.
    }

    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}


    public static void main(String[] args)
    {
        ButtonTest m = new ButtonTest("Main");
        Button b = new Button("눌러 줘잉~");
        b.addActionListener(new ButtonHandler());
        m.add(b, "Center");
        m.pack();
        m.setVisible(true);
    } // public static void main(String[] args)
}
