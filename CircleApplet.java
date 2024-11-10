package JP;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CircleApplet extends Applet implements ActionListener {
    int i = 0, j = 0;
    Button b1, b2, b3, b4;

    public void paint(Graphics g) {
        g.drawOval(200 + j, 100, 100 + i, 100 + i);
    }

    public void init() {
        b1 = new Button("Shrink");
        b1.setBounds(80, 150, 200, 50);
        b2 = new Button("Grow");
        b2.setBounds(80, 150, 200, 50);
        b3 = new Button("Move left");
        b3.setBounds(80, 150, 200, 50);
        b4 = new Button("Move right");
        b4.setBounds(80, 150, 200, 50);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            i = i - 50;
            repaint();
        } else if (e.getSource() == b2) {
            i = i + 50;
            repaint();
        } else if (e.getSource() == b3) {
            j = j - 50;
            repaint();
        } else {
            j = j + 50;
            repaint();
        }
    }
}
/*
 * <applet code="CircleApplet.class" width=500 height=500>
 * </applet>
 */
