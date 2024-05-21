package Demo09;

import Demo08.MyFrame;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Myframe frame=new Myframe("下拉列表");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,400);
        frame.setVisible(true);


    }

}
