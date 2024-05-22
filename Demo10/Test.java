package Demo10;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("文本框");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
