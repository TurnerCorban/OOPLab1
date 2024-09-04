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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("sansserif", Font.PLAIN, 50));
        int nexty = 100;
        int temp = 0;
        temp = Purse.cash.get(Purse.onehundred);
        if ((temp = Purse.cash.get(Purse.onehundred)) > 0) {
            JLabel hundredlabel = new JLabel(temp + " Hundred Dollar Bills");
            g.drawString(hundredlabel.getText(), 250, nexty);
            ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.onehundred));
            g.drawImage(ImageIcon.getImage(), 100, nexty, 140,100, null);

            nexty += 40;
        }
        if ((temp = Purse.cash.get(Purse.fifty)) > 0) {
            JLabel hundredlabel = new JLabel(temp + " Hundred Dollar Bills");
            g.drawString(hundredlabel.getText(), 250, nexty);
            ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.onehundred));
            g.drawImage(ImageIcon.getImage(), 100, nexty, 140,120, null);

            nexty += 40;
        }
        if ((temp = Purse.cash.get(Purse.twenty)) > 0) {
            JLabel twentylabel = new JLabel(temp + " Twenty Dollar Bills");
            g.drawString(twentylabel.getText(), 250, nexty);
            ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.twenty));
            g.drawImage(ImageIcon.getImage(), 100, nexty, 400,120, null);
            nexty += 40;
        }
        if ((temp = Purse.cash.get(Purse.ten)) > 0) {
            JLabel tenlabel = new JLabel(temp + " Fifty Dollar Bills");
            g.drawString(tenlabel.getText(), 250, nexty);
            ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.twenty));
            g.drawImage(ImageIcon.getImage(), 100, nexty, 400,120, null);
            nexty += 40;
        }
        if ((temp = Purse.cash.get(Purse.one)) > 0) {
            JLabel onelab = new JLabel(temp + " One Dollar Bills");
            g.drawString(onelab.getText(), 250, nexty);
            ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.one));
            g.drawImage(ImageIcon.getImage(), 100, nexty, 400,120, null);
            nexty += 40;
        }
        if ((temp = Purse.cash.get(Purse.quarter)) > 0) {
            JLabel quarterlabel = new JLabel(temp + " Quarters");
            g.drawString(quarterlabel.getText(), 250, nexty);
            ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.quarter));
            g.drawImage(ImageIcon.getImage(), 100, nexty, 400,120, null);
            nexty += 40;
        }
        if ((temp = Purse.cash.get(Purse.dime)) > 0) {
            JLabel dimelabel = new JLabel(temp + " Dimes");
            g.drawString(dimelabel.getText(), 250, nexty);
            ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.dime));
            g.drawImage(ImageIcon.getImage(), 100, nexty, 400,120, null);
            nexty += 40;
        }
        if ((temp = Purse.cash.get(Purse.nickel)) > 0) {
            JLabel nickellabel = new JLabel(temp + " Nickels");
            g.drawString(nickellabel.getText(), 250, nexty);
            ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.nickel));
            g.drawImage(ImageIcon.getImage(), 100, nexty + 10, 400,120, null);
            nexty += 40;
        }
        if ((temp = Purse.cash.get(Purse.penny)) > 0) {
            JLabel pennylabel = new JLabel(temp + " Pennies");
            g.drawString(pennylabel.getText(), 250, nexty);
            ImageIcon ImageIcon = new ImageIcon(purse.getImg(Purse.penny));
            g.drawImage(ImageIcon.getImage(), 100, nexty + 10, 400,120, null);
            nexty += 40;
        }
        revalidate();
        repaint();
    }
}
