import javax.swing.JFrame;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Portfolio");
        MainPanel app = new MainPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(app);
        
        frame.pack();
        frame.setVisible(true);
    }
}
