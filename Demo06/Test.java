package Demo06;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("这是一个显示时间的窗口");//设置默认关闭操作
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
