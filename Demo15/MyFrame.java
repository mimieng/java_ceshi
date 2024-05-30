package Demo15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class MyFrame extends JFrame implements ActionListener {
    JButton a1 = new JButton("确定");
    JButton a2 = new JButton("重新开始");
    JButton a3 = new JButton("退出");
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JTextField textField = new JTextField(10);

    JLabel label3= new JLabel();
    JLabel label1 = new JLabel("输入要猜的数字:");
    Random r = new Random();
    int number2 = r.nextInt(1000) + 1;
   int i = 0;
   JLabel label = new JLabel("你已经猜了0次!");
    public MyFrame(String title) {
        super(title);
        this.setContentPane(panel);
        panel.setLayout(new BorderLayout());//边界布局器

       //while (i < 3) {
           // JLabel label = new JLabel("你已经猜了" + i + "次" + "!");

            label.setHorizontalAlignment(SwingConstants.CENTER);//水平居中



            panel.add(label, BorderLayout.NORTH);
            panel2.add(label1);
            panel2.add(textField);
            panel2.add(label3);

            panel.add(panel2, BorderLayout.CENTER);
            panel1.add(a1);
            panel1.add(a2);
            panel1.add(a3);
            panel.add(panel1, BorderLayout.SOUTH);

            a2.addActionListener(this);
            this.exit();
            this.restart();
           // i++;


    }
    public void exit(){
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


    public void restart() {

        a1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Double number1 = Double.valueOf(textField.getText());

                //随机(1到1000的数)
                System.out.println(number2);
                while (true) {
                    i++;
                    label.setText("你已经猜了"+i+"次!");
                    if (number1 == number2) {
                       label3.setText("猜中了");

                        panel2.setBackground(Color.WHITE);
                        JOptionPane.showMessageDialog(textField, "恭喜你，猜对了！！！", "恭喜了", 1);
                        break;
                    } else if (number1 < number2) {
                        label3.setText("太小!");
                        panel2.setBackground(Color.BLUE);
                        break;
                    } else if (number1 > number2) {
                        label3.setText("太大!");
                        panel2.setBackground(Color.RED);
                        break;
                    }
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("");
    }

}






