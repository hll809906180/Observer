package listener.awt;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * AWT 监听模式
 */
public class MouseAplication extends JFrame implements MouseListener {

    private JLabel j = new JLabel("测试文本区域");

    private JTextArea jt = new JTextArea();

    public MouseAplication() {

         //注册监听器
        j.addMouseListener(this);
        jt.addKeyListener(new keyAplication());
        //添加容器属性
        this.add(j, BorderLayout.NORTH);
        this.add(jt, BorderLayout.CENTER);
        this.setSize(700, 900);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MouseAplication();
    }

    @Override
    public void mouseClicked(MouseEvent e) {// 单击鼠标时执行的操作
        jt.append("鼠标单击了此文本区域\n");
    }

    @Override
    public void mouseEntered(MouseEvent e) {// 鼠标进入组件时执行的操作
        jt.append("鼠标进入了此文本区域\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {// 鼠标离开组件时执行的操作
        jt.append("鼠标离开了此文本区域\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {// 鼠标在组件上按下时执行的操作
        jt.append("在此文本区域你按下了鼠标\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {// 鼠标释放时执行的操作
        jt.append("鼠标按键释放了\n");
    }

    //键盘监听器
    class keyAplication implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            jt.append("文本域按下鍵"+KeyEvent.getKeyText(e.getKeyCode())+"\n");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            jt.append("文本域释放鍵\n");
        }
    }
}

