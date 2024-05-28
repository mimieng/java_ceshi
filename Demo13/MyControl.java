package Demo13;

import java.awt.*;
import javax.swing.*;

public class MyControl extends JPanel {//自定义控件
    public void paintComponent(Graphics g) {
        super.paintComponent(g);//调用父类的方法
        int width = this.getWidth();//
        int height = this.getHeight();
        g.setColor(new Color(0,0,255,128));

        g.fillRect(0, 0, width, height);
        g.setColor(new Color(255,255,255,199));
        g.fillRect(20, 30, 60,30);
    }
}
