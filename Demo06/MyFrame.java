package Demo06;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame {
    JLabel timejlabel=new JLabel("00 00 00");
    public MyFrame(String title) {
        super(title);
        JPanel panel = new JPanel();//这是一个容器
        this.setContentPane(panel);//设置内容窗格
        JButton button=new JButton("按钮");//创建按钮这个对象
        panel.add(button);//在容器中添加按钮

        panel.add(timejlabel);

        button.addActionListener((e)->{//Lambda表达式
            showtime();
                }
        );
    }
    public void showtime() {

        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = timeFormat.format(new Date());
        timejlabel.setText(time);
    }
}
