package Demo07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JTextField textField = new JTextField(10);
    public MyFrame( String title ) {
        super( title );
        JPanel panel = new JPanel();//创建容器
        this.setContentPane(panel);
        panel.add( textField );//在容器中添加文本框
        textField.setText( "你好" );//初始化文字
        JButton button =new JButton("ok");//创建按钮
        panel.add(button);//在容器中创建按钮
        button.addActionListener((e)->{//Lambda表达式
        test();
        });
    }
public void test(){
        String str=textField.getText();
        System.out.println(str);
}
}
