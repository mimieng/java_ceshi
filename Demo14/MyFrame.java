package Demo14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    private  JTextField textField = new JTextField(15);
    private JPanel panel =new JPanel();
    private JButton button=new JButton("清除");
    private JPanel panelcenter =new JPanel();
    public MyFrame(String title) {
        super(title);
        this.setLayout(new BorderLayout());//设置布局
        this.setResizable(false);
        this.addComponent();
        this.addComponentCenter();
        }
        public void addComponent(){

            panel.add(textField);
            this.button.setForeground(Color.blue);//设置按钮颜色
            panel.add(button);
            button.addActionListener(new ActionListener() {//给按钮添加监听器
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText("");//清空
                }
            });
            this.add(panel,BorderLayout.NORTH);
        }
        public void addComponentCenter(){
        String buttontext="123+456-789*0.=/";//定义按键
        this.panelcenter.setLayout(new GridLayout(4,4));
        for(int i=0;i<16 ;i++){//分配按键
            String temp=buttontext.substring(i,i+1);
            JButton buttoncenter =new JButton();
            buttoncenter.setText(temp);
            buttoncenter.addActionListener(this);
            panelcenter.add(buttoncenter);
        }

        this.add(panelcenter,BorderLayout.CENTER);
        }

     private String firstInput=null;
    private String operator=null;
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand();
        if (".0123456789".indexOf(str)!=-1){
            this.textField.setText(textField.getText()+str);
        }else if (str.matches("[\\+\\-*/]{1}")){
            operator=str;
            firstInput =this.textField.getText();
            this.textField.setText("");
        }else if (str.equals("=")){
            Double a=Double.valueOf(firstInput);
            Double b=Double.valueOf(this.textField.getText());
            Double resurt=null;
            switch(operator) {//定义操作符号的作用
                case "+":
                    resurt = a + b;
                    break;
                case "-":
                    resurt = a - b;
                    break;
                case "*":
                    resurt = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        resurt = a / b;
                    }
                    break;
            }
            this.textField.setText(resurt.toString());

        }

    }

    }

