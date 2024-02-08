import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CenterPanel extends JPanel {

    Font font1 = new Font(Font.SERIF, Font.PLAIN, 20);
    JLabel labelName = new JLabel("Nome: ");
    JLabel labelSurname = new JLabel("Cognome: ");
    JLabel labelTel = new JLabel("Num. Tel.: ");

    JTextField fieldName = new JTextField("Inserisci...", 20);
    JTextField fieldTel = new JTextField("Inserisci...",20);
    JTextField fieldSurname = new JTextField("Inserisci...",20);

    public CenterPanel()
    {
        setBackground(Color.gray);
        setLayout(new GridLayout(8,1));

        JPanel panelNorth = new JPanel(new FlowLayout());
        JPanel panelCenter = new JPanel(new FlowLayout());
        JPanel panelSouth = new JPanel(new FlowLayout());

        panelNorth.add(initializeLabel(labelName));
        panelNorth.add(initializeTextField(fieldName));
        panelNorth.setBackground(Color.gray);
        panelCenter.add(initializeLabel(labelSurname));
        panelCenter.setBackground(Color.gray);
        panelCenter.add(initializeTextField(fieldSurname));
        panelSouth.add(initializeLabel(labelTel));
        panelSouth.setBackground(Color.gray);
        panelSouth.add(initializeTextField(fieldTel));

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
        t.setPreferredSize(new Dimension(150, 25));
        t.setName("Inserisci...");
        applyShadow(t);

        return t;
    }

    public void applyShadow(JTextField f)
    {
        f.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(f.getText().equals(f.getName())) {
                    f.setText("");
                    f.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(f.getText().isEmpty()) {
                    f.setText(f.getName());
                    f.setForeground(Color.gray);
                }
            }
        });
    }
}
