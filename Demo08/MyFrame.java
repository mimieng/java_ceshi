package Demo08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JCheckBox agree = new JCheckBox("同意用户协议");
    JButton button=new JButton("下一步");
    public MyFrame( String title ) {
        super(title);
        JPanel panel = new JPanel();
        this.setContentPane(panel);

        panel.add(agree);
        panel.add(button);
        agree.setSelected(false);//初始状态为不勾选
        button.setEnabled(false);//禁用状态
        agree.addActionListener(new ActionListener() {//给JCheckBox添加事件处理
       public void actionPerformed(ActionEvent e) {
         if(agree.isSelected()){
             button.setEnabled(true);
         }
         else {
             button.setEnabled(false);
         }
       }
        });
    }

}
