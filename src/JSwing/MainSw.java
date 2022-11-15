package JSwing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainSw {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("DEMO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("mo_spooky_spill.jpeg");
        frame.setIconImage(image.getImage());
    }
}
