import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MakingChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Making Change");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        RegisterPanel panel = new RegisterPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        JFrame frame2 = new JFrame("Purse");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PursePanel PursePanel = new PursePanel();
        frame2.getContentPane().add(PursePanel);
        frame2.pack();
        frame2.setVisible(true);
        frame2.setLocation(700, 0);

    }
}
