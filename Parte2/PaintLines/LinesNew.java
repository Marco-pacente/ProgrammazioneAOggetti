import javax.swing.*;
public class LinesNew extends JFrame{
    public LinesNew(String titolo){
        super(titolo);
        Pannello p;
        p = new Pannello();
        add(p);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}