import javax.swing.*;
public class Pannello extends JFrame{
    public Pannello(){
        super("finestra");
        JTextField text = new JTextField(20);
        JButton button = new JButton("premi");
        add(text);
        add(button);
        setBounds(300, 400, 300, 200);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
}