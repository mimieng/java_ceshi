package Demo11;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        JPanel panel = new JPanel();

        this.setContentPane(panel);
        panel.setLayout(new BorderLayout());//边界布局器
        JLabel a1 = new ColorLabel("1", Color.yellow);
        JLabel a2 = new ColorLabel("2", Color.blue);
        JLabel a3 = new ColorLabel("3", Color.red);
        ColorLabel a4 = new ColorLabel("4", Color.orange);
        ColorLabel a5 = new ColorLabel("5", Color.black);
        panel.add(a1, BorderLayout.WEST);
        panel.add(a2, BorderLayout.EAST);
        panel.add(a3, BorderLayout.NORTH);
        panel.add(a4, BorderLayout.SOUTH);
        panel.add(a5, BorderLayout.CENTER);


    }


    }
