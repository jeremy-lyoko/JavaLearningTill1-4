package ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        setSize(400, 400);
        setTitle("拼图-登录");
        setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        //设置关闭方式
        this.setDefaultCloseOperation(3);
        setVisible(true);
    }
}
