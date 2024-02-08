import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI()
    {
        super("Nome Gestore");
        setBackground(Color.gray);
        setSize(800, 600);
        setLayout(new BorderLayout());

        IntroPanel panelNorth = new IntroPanel();
        CenterPanel panelCenter = new CenterPanel();
        BottomPanel panelBottom = new BottomPanel();



        add(panelNorth, BorderLayout.NORTH);
        add(panelCenter, BorderLayout.CENTER);
        add(panelBottom, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
