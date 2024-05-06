import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Pulsante extends JButton {
    public Pulsante(Pannello p, String s){
        super(s);
        setEnabled(true);
        setVisible(true);
        setBounds(100, 100, 100, 20);
        setEnabled(true);
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("cancellando");
                p.currspots = 0;
                p.repaint();
            }
        });
    }

}