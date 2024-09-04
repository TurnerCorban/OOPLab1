import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterPanel extends JPanel {
    private final JTextField textField;
    private final JLabel label;

    static Register Register = new Register();
    static Purse purse = Register.makeChange(-1);

    //Register register = new Register();
    public RegisterPanel() {

        this.setBorder(BorderFactory.createTitledBorder("Register Panel"));
        this.setPreferredSize(new Dimension(700, 700));
        this.setBackground(new Color(50, 168, 168));

        textField = new JTextField(16);
        textField.setPreferredSize(new Dimension(300, 50));
        textField.setFont(new Font("sansserif", Font.PLAIN, 40));
        textField.addActionListener(new input());

        label = new JLabel("Enter ammount: ");
        label.setFont(new Font("sansserif", Font.PLAIN, 40));

        this.add(textField);
        this.add(label);
    }

    public static Purse purse() {
        return purse;
    }

    public class input implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = textField.getText();
            double amt = Double.parseDouble(text);

            purse = Register.makeChange(amt);

            label.setBounds(50, 50, 100, 30);
            label.setText(purse.toStringHtml());


            revalidate();
            repaint();
        }
    }


}