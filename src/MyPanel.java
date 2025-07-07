import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyPanel extends JPanel implements ActionListener
{
    int x=0;
    int y=0;

    int xvelocity=2;
    int yvelocity=1;

    final int PANEL_WIDTH=500;
    final int PANEL_HEIGHT=500;

    ImageIcon og=new ImageIcon("pix.png");
    Image c=og.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
    //Image c=new ImageIcon("pix.png").getImage();
    ImageIcon og1=new ImageIcon("img.png");
    Image background=og1.getImage().getScaledInstance(500,500,Image.SCALE_SMOOTH);
    //Image background=new ImageIcon("img.png").getImage();
    Timer timer=new Timer(10,this);
    //Timer timer;

    MyPanel()
    {
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
       // timer=new Timer(10,this);
        timer.start();
    }
    public void paint(Graphics g)
    {
        super.paint(g);  //paint the background
        Graphics2D g2d=(Graphics2D) g;
        g2d.drawImage(background,0,0,null);
        g2d.drawImage(c,x,y,null);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(x>=PANEL_WIDTH-c.getWidth(null)||x<0)//top left corner
        {
            xvelocity=xvelocity*-1;
        }
        x=x+xvelocity;

        if(y>=PANEL_HEIGHT-c.getHeight(null)||y<0)
        {
            yvelocity=yvelocity*-1;
        }
        y=y+yvelocity;
        repaint();
    }
}
