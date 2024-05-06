import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pannello extends JPanel implements MouseListener {
    final int MAXSPOTS = 10;
    int spotX[] = new int[MAXSPOTS];
    int spotY[] = new int[MAXSPOTS];
    int currspots = 0;
    public Pannello(){
        Pulsante p = new Pulsante(this, "canc");
        add(p);
    }

    
    public void mouseEntered(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}

    
    public void mousePressed(MouseEvent e){
        if (currspots >= MAXSPOTS) {
            System.out.println("Troppi pallini");
        }else{
            addSpot(e.getX(), e.getY());
        }
    }

    public void addSpot(int x, int y){
        spotX[currspots] = x;
        spotY[currspots] = y;
        currspots++;
        repaint();
    }

    public void paintComponent(Graphics g){
        setBackground(Color.white);
        super.paintComponent(g);
        g.setColor(Color.blue);
        for(int i = 0; i < currspots; i++){
            g.fillOval(spotX[i]-10, spotY[i]-10, 20, 20);
        }
        System.out.println("fatto");
    }
}