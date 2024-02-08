import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    Font font1 = new Font(Font.MONOSPACED, Font.PLAIN, 20);
    JLabel labelName = new JLabel("Nome: ");
    JLabel labelSurname = new JLabel("Cognome: ");
    JLabel labelTel = new JLabel("Num. Tel.: ");

    JTextField fieldName = new JTextField(20);
    JTextField fieldTel = new JTextField(20);
    JTextField fieldSurname = new JTextField(20);

    public CenterPanel()
    {
        setBackground(Color.gray);
        setLayout(new GridLayout(8,1));

        JPanel panelNorth = new JPanel(new FlowLayout());
        JPanel panelCenter = new JPanel(new FlowLayout());
        JPanel panelSouth = new JPanel(new FlowLayout());

        panelNorth.add(initializeLabel(labelName));
        panelNorth.add(fieldName);
        panelNorth.setBackground(Color.gray);
        panelCenter.add(initializeLabel(labelSurname));
        panelCenter.setBackground(Color.gray);
        panelCenter.add(fieldSurname);
        panelSouth.add(initializeLabel(labelTel));
        panelSouth.setBackground(Color.gray);
        panelSouth.add(fieldTel);

        add(panelNorth);
        add(panelCenter);
        add(panelSouth);
    }

    public JLabel initializeLabel(JLabel l)
    {
        l.setFont(font1);

        return l;
    }

    public JTextField initializeTextField(JTextField t)
    {
        t.setPreferredSize(new Dimension(150, 5));

        return t;
    }
}
