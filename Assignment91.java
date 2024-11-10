package JP;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Assignment91 extends Applet implements ActionListener {
    Button b1, b2, b3, b4;
    TextField t1, t2, t3;
    Label l1, l2, l3;

    public void init() {
        l1 = new Label("Enter first number:");
        l1.setBounds(30, 150, 200, 50);
        t1 = new TextField();
        t1.setBounds(30, 150, 200, 20);
        l2 = new Label("Enter second number:");
        l2.setBounds(30, 200, 200, 50);
        t2 = new TextField();
        t2.setBounds(30, 200, 200, 20);
        b1 = new Button("Add");
        b1.setBounds(80, 150, 60, 50);
        b2 = new Button("Subtract");
        b2.setBounds(80, 150, 60, 50);
        b3 = new Button("Multiply");
        b3.setBounds(80, 150, 60, 50);
        b4 = new Button("Divide");
        b4.setBounds(80, 150, 60, 50);
        l3 = new Label("Result");
        l3.setBounds(80, 150, 60, 50);
        t3 = new TextField();
        t3.setBounds(80, 150, 60, 30);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
        add(t3);
        t3.setEditable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        if (e.getSource() == b1) {

            int add = n1 + n2;
            t3.setText(Integer.toString(add));
        } else if (e.getSource() == b2) {
            int sub = n1 - n2;
            t3.setText(Integer.toString(sub));
        } else if (e.getSource() == b3) {
            int mul = n1 * n2;
            t3.setText(Integer.toString(mul));
        } else {
            int div = n1 / n2;
            t3.setText(Integer.toString(div));
        }
    }
}
/* <applet code="Assignment91.class" width=500 height=500></applet> */
