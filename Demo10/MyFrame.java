package Demo10;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        JLabel label = new JLabel();
        panel.add(label);
        label.setOpaque(true);//背景不透明
        label.setText("你好世界");
        label.setFont(new Font("楷书", Font.PLAIN, 30));
        label.setForeground(new Color(255, 121, 123));//设置背景色
        label.setPreferredSize(new Dimension(160, 30));//控件指定宽度高度
        label.setHorizontalAlignment(SwingConstants.CENTER);//水平居中
    }
}
