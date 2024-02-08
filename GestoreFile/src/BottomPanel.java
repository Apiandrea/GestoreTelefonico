import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {

    JButton buttonAccedi = new JButton("Accedi");
    JPanel centerPanelAccedi = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel centerPanelLabel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JButton buttonRegistrati = new JButton("Registrati");
    JPanel centerPanelRegistrati = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JLabel labelOr = new JLabel("Oppure");

    public BottomPanel()
    {
        setLayout(new BorderLayout());
        centerPanelLabel.add(labelOr);
        centerPanelLabel.setBackground(Color.gray);
        centerPanelAccedi.add(buttonAccedi);
        centerPanelAccedi.setBackground(Color.lightGray);
        centerPanelRegistrati.add(buttonRegistrati);
        centerPanelRegistrati.setBackground(Color.lightGray);

        add(centerPanelAccedi, BorderLayout.NORTH);
        add(centerPanelLabel, BorderLayout.CENTER);
        add(centerPanelRegistrati, BorderLayout.SOUTH);
    }
}
