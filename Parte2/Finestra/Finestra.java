import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Finestra extends JFrame implements ActionListener {
    protected JLabel l;
    protected JTextArea output;
    protected JTextField input;
    protected JList scelta;
    DefaultListModel listModel = new DefaultListModel();
    protected Thread ascolta= null;

    public Finestra(String titolo){
        super(titolo);
        setVisible(true);
        setBounds(50, 50, 100, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel pannello = new JPanel();
        pannello.setLayout(new BorderLayout());
        setFont(new Font("Helvetica", Font.PLAIN, 14));
        setLayout(new BorderLayout());
        output = new JTextArea("", 10, 10);
        JScrollPane sp = new JScrollPane(output);
        output.setEditable(false);
        listModel.addElement("Tutti");
        scelta= new JList(listModel);
        scelta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scelta.setSelectedIndex(0);
        JScrollPane sp2 = new JScrollPane(scelta);
        pannello.add(sp2,"Center");
            
        add(pannello,"East");
            
        l= new JLabel("Destinatario:");
        pannello.add(l,"North");
            
        input = new JTextField();
        input.setEditable(false);
        input.addActionListener(this);
        add(input,"South");
        input.setEditable(true);
        input.requestFocus();
        input.setVisible(true);

    }
    
    public void actionPerformed(ActionEvent e) {
        if ((e.getSource() instanceof TextField) && ((JTextField) e.getSource() == input) && (!input.getText().equals(""))){
            output.setText(input.getText());
        }
    }

    public static void main(String[] args) {
        Finestra f = new Finestra("ao");
    }
}