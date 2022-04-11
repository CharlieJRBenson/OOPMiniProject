import java.awt.*;
import java.awt.event.*;

public class Prompt extends Frame {

    private Button okButton;

    public Prompt() {
        this.setLayout(new GridLayout(0, 2));
        okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                ((Frame) (evt.getSource())).dispose();
            }
        });
    }

    public void addokButtonListener(ActionListener listener) {
        okButton.addActionListener(listener);
    }

    public void activate() {
        this.add(okButton);
        this.pack(); // Resizes to tightly fit all its components
        this.setLocationRelativeTo(null); // Centers the window on the screen
        this.setVisible(true);
    }

}
