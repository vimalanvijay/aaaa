import java.awt.*;
public class Circle {

        private int rad; // Fields
        private Point pos;
        private Color col;

        public Circle(Point initPos, Color col, int radius){ // The constructor
            rad=radius; // Initialize fields
            pos=initPos;
            this.col=col;
           
        }
        public void draw(Graphics g) { // A method that draws the object in g
            g.setColor(col);
            g.fillOval(pos.x,pos.y,rad, rad);
        }

}
