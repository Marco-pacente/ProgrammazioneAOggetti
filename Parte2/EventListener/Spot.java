import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Spot extends JFrame {
    public Spot(String titolo){
        super(titolo);
        Pannello p = new Pannello();
        add(p);
        setBackground(Color.white);
        p.addMouseListener(p);
    }
    public static void main(String[] args){
        Spot finestra = new Spot("Spot");
        finestra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        finestra.setBounds(50, 300, 400, 300);
        finestra.setVisible(true);
    }
}