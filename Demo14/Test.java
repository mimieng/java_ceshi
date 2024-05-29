package Demo14;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String [] args){
        int SCREE_W= Toolkit.getDefaultToolkit().getScreenSize().width;
        int SCREE_H= Toolkit.getDefaultToolkit().getScreenSize().height;
        MyFrame frame =new MyFrame("计算器");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(350,250);
        frame.setLocation(SCREE_W/2,SCREE_H/2);

    }
}
