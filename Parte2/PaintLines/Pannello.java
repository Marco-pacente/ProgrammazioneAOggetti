import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pannello extends JPanel implements MouseListener, MouseMotionListener {
    final int MAXLINES = 10;
    Point starts[] = new Point[MAXLINES];
    Point ends[] = new Point[MAXLINES];
    Point anchor;
    Point currentPoint;
    int currline = 0;
    public void mouseClicked(MouseEvent e){}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    
    public void mousePressed(MouseEvent e) {
        if (currline < MAXLINES) {
            anchor = new Point(e.getX(), e.getY());
        }else{
            System.out.println("troppe linee");
        }
    }

    void addline(int x, int y){
        starts[currline] = ;
    }
}