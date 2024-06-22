
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Button이 눌려졌네.");
        System.out.println("Button에 쓰인 글은 " + e.getActionCommand());
    }
}