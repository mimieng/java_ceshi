package Demo05;

import javax.swing.*;

public class Test01 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("这是一个显示时间的窗口");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
