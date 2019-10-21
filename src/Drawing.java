import java.awt.*;
import javax.swing.*;

public class Drawing extends Canvas{
    private JFrame f;
    private Circle circle;

    public Drawing(){
        Point p=new Point(200,200);
        Color c=new Color(0x665544);
        circle=new Circle(p,c,100);
        f=new JFrame("My window");
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(500, 500); // Sets the Canvas size to be the same as the frame

    }

    public void paint(Graphics g){
        circle.draw(g);
    }




}
