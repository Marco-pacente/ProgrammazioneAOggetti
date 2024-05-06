import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Keys extends JFrame{
    public Keys(String titolo){
        super(titolo);
        Pannello p = new Pannello();
        add(p);
        setBounds(50, 300, 400, 300);
        setVisible(true);
        p.currx = (p.getSize().width/2)-8;
        p.curry = (p.getSize().width/2)-16;
        p.setBackground(Color.white);
        p.setFont(new Font("Helvetica", Font.BOLD, 36));
        addKeyListener(p);
    }

    public static void main(String[] args) {
        Keys finestra = new Keys("keys");
        finestra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}