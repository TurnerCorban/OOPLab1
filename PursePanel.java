import javax.swing.*;
import java.awt.*;

public class PursePanel extends JPanel {
    static Purse purse = RegisterPanel.purse();
    private static JLabel label;

    public PursePanel() {

        this.setBorder(BorderFactory.createTitledBorder("Purse"));
        this.setPreferredSize(new Dimension(700, 500));
        this.setBackground(new Color(204, 137, 96));

        label = new JLabel();
        label.setFont(new Font("sansserif", Font.PLAIN, 100));
        this.add(label);
        label = new JLabel("Purse");



    }

    public void setOutput(){
        ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.quarter));
        Image image = ImageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon = new ImageIcon(newimg);
        label.setIcon(ImageIcon);
        revalidate();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);


    }
}
