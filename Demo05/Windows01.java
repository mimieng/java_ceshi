package Demo05;

import javax.swing.*;

public class Windows01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//显示窗口
       JPanel panel = new JPanel();//是个容器
       JLabel jlabel=new JLabel("张祖鹏是帅逼");
       panel.add(jlabel);//在容器中添加组件
        frame.setContentPane(panel);//设置容器
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("测试");//
       panel.add(button);
        frame.add(button);
        frame.setSize(300,300);//设置窗口大小
        frame.setVisible(true);
    }
}
