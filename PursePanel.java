import javax.swing.*;
import java.awt.*;

public class PursePanel extends JPanel {
    static Purse purse = RegisterPanel.purse();
    private static JLabel label;

    public PursePanel() {

        this.setBorder(BorderFactory.createTitledBorder("Purse"));
        this.setPreferredSize(new Dimension(700, 700));
        this.setBackground(new Color(204, 137, 96));

        label = new JLabel();
        label.setFont(new Font("sansserif", Font.PLAIN, 100));
        this.add(label);
        label = new JLabel("Purse");
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("sansserif", Font.PLAIN, 30));
        int nexty = 100;
        int textx = 300;
        int temp = 0;
        temp = Purse.cash.get(Purse.onehundred);
        if ((temp = Purse.cash.get(Purse.onehundred)) > 0) {
            for (int i = 0; i < temp; i++){
                ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.onehundred));
                g.drawImage(ImageIcon.getImage(), 20+(i*40), nexty-50, null);
            }
            nexty += 110;
        }
        if ((temp = Purse.cash.get(Purse.fifty)) > 0) {
            for (int i = 0; i < temp; i++){
                ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.fifty));
                g.drawImage(ImageIcon.getImage(), 20+(i*40), nexty-50, null);
            }
            nexty += 110;
        }
        if ((temp = Purse.cash.get(Purse.twenty)) > 0) {
            for (int i = 0; i < temp; i++){
                ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.twenty));
                g.drawImage(ImageIcon.getImage(), 20+(i*40), nexty-50, null);
            }
            nexty += 110;
        }
        if ((temp = Purse.cash.get(Purse.ten)) > 0) {
            for (int i = 0; i < temp; i++){
                ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.ten));
                g.drawImage(ImageIcon.getImage(), 20+(i*40), nexty-50, null);
            }
            nexty += 110;
        }
        if ((temp = Purse.cash.get(Purse.one)) > 0) {
            for (int i = 0; i < temp; i++){
                ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.one));
                g.drawImage(ImageIcon.getImage(), 20+(i*40), nexty-50, null);
            }
            nexty += 110;
        }
        if ((temp = Purse.cash.get(Purse.quarter)) > 0) {
            for (int i = 0; i < temp; i++){
                ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.quarter));
                g.drawImage(ImageIcon.getImage(), 20+(i*40), nexty-50, null);
            }
            nexty += 110;
        }
        if ((temp = Purse.cash.get(Purse.dime)) > 0) {
            for (int i = 0; i < temp; i++){
                ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.dime));
                g.drawImage(ImageIcon.getImage(), 20+(i*40), nexty-50, null);
            }
            nexty += 110;
        }
        if ((temp = Purse.cash.get(Purse.nickel)) > 0) {
            for (int i = 0; i < temp; i++){
                ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.nickel));
                g.drawImage(ImageIcon.getImage(), 20+(i*40), nexty-50, null);
            }
            nexty += 110;
        }
        if ((temp = Purse.cash.get(Purse.penny)) > 0) {
            for (int i = 0; i < temp; i++){
                ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.penny));
                g.drawImage(ImageIcon.getImage(), 20+(i*40), nexty-50, null);
            }
            nexty += 110;
        }
        revalidate();
        repaint();
    }
}
