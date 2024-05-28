package Demo12;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JLabel a1 = new ColorLabel("1", Color.yellow);
    JLabel a2 = new ColorLabel("2", Color.blue);
    JLabel a3 = new ColorLabel("3", Color.red);
    ColorLabel a4 = new ColorLabel("4", Color.orange);
    ColorLabel a5 = new ColorLabel("5", Color.black);
    public MyFrame(String title) {
        super(title);
        JPanel panel = new JPanel();

        this.setContentPane(panel);
        panel.setLayout(null);//设置布局为空
        
        panel.add(a1);
        panel.add(a2);
        panel.add(a3);
        panel.add(a4);
        panel.add(a5);
        a1.setBounds(0, 0, 100, 20);//自定义布局
        a2.setBounds(400, 0, 100, 20);
        a3.setBounds(0, 300, 100, 20);
        a4.setBounds(400, 300, 100, 20);
        a5.setBounds(200, 150, 100, 20);
    }

}
