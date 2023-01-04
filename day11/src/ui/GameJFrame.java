package ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    int[][] data = new int[4][4];

    public GameJFrame() {
        initData();
        initImage();
        initJFrame();
        initJMenuBar();


    }

    private void initData() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        int num = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                data[i][j] = arr[num];
                num++;
            }
        }
    }

    private void initImage() {
        // int num = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int index = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\1339\\IdeaProjects\\day11Game\\imageCut\\img_" + index + ".jpg"));
                //图片位置
                jLabel.setBounds(160 * j, 120 * i, 160, 120);

                this.getContentPane().add(jLabel);
                //  num++;
            }
        }


    }

    private void initJMenuBar() {
        //菜单
        JMenuBar jMenuBar = new JMenuBar();
        JMenu function = new JMenu("功能");
        JMenu about = new JMenu("关于");

        JMenuItem replayItem = new JMenuItem("重新开始");
        JMenuItem reLogItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭");
        //组合,条目添加到选项
        function.add(replayItem);
        function.add(reLogItem);
        function.add(closeItem);
        //选项到菜单
        jMenuBar.add(function);
        jMenuBar.add(about);

        this.setJMenuBar(jMenuBar);
        setVisible(true);
    }

    private void initJFrame() {
        setSize(800, 800);
        setTitle("拼图游戏");
        setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        //设置关闭方式
        this.setDefaultCloseOperation(3);

        this.setLayout(null);
    }
}
