package Demo07;

import javax.swing.*;

public class Test {
    public static void main(String[] args){
        MyFrame frame = new MyFrame("显示文本");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,400);
        frame.setVisible(true);
    }
}
