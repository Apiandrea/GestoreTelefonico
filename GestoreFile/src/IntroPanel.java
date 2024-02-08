import javax.swing.*;
import java.awt.*;

public class IntroPanel extends JPanel {

    private JLabel labelIntro = new JLabel();
    Font font1 = new Font(Font.SERIF, Font.PLAIN,15);
    public IntroPanel()
    {
        setBackground(Color.lightGray);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        labelIntro.setFont(font1);
        labelIntro.setText("Benvenuto! Accedi o Registrati ed esplora cosa puoi fare con \"Nome Gestore\"!");

        add(labelIntro);
    }
}
