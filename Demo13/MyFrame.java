package Demo13;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        JPanel panel =new JPanel();
        this.setContentPane(panel);
        MyControl control = new MyControl();
        panel.add(control);
        control.setPreferredSize(new Dimension(100,100));
    }
}
