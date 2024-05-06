import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.*;

public class Pannello extends JPanel implements KeyListener {
    char currKey;
    int currx;
    int curry;
    public void keyReleased(KeyEvent e){}

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_DOWN:
                curry+=5;                
                break;
            
            case KeyEvent.VK_UP:
                curry-=5;
                break;
            
            case KeyEvent.VK_RIGHT:
                currx+=5;
                break;

            case KeyEvent.VK_LEFT:
                currx-=5;
                break;

            default:
                currKey = e.getKeyChar();
                break;
                
            }
            repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (currKey!=0) {
            g.drawString(String.valueOf(currKey), currx, curry);
        }
    }
    
}