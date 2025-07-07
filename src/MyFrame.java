import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    MyPanel panel=new MyPanel();

    MyFrame()
    {
      this.add(panel);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.pack();
      this.setVisible(true);
    }
}
