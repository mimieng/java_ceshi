package Demo09;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame {
    JComboBox <String>combo = new JComboBox<>();
    public Myframe( String title) {
        super(title);
        JPanel panel = new JPanel();
        this.setContentPane(panel);

        panel.add(combo);
        combo.addItem("红色");
        combo.addItem("橙色");
        combo.addItem("黄色");
        combo.addItem("绿色");
        JButton button=new JButton("button");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            public  void actionPerformed(ActionEvent e) {
                test();
            }
        });
    }
    private void test() {
        int dex=combo.getSelectedIndex();
        int count=combo.getItemCount();
        String str=combo.getItemAt(2);
        System.out.println("用户选择第"+dex+"项");
        System.out.println(count+str);
    }
}
