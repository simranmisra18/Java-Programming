package JP;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Assignment345 extends Applet implements ActionListener {
    int count = 0;
    Button b1;
    TextField t1, t2;
    Label l1, l2, l3;

    public void init() {
        l1 = new Label("Username:");
        l1.setBounds(30, 150, 200, 500);
        t1 = new TextField();
        t1.setBounds(30, 150, 200, 2000);
        l2 = new Label("Password:");
        l2.setBounds(30, 200, 200, 500);
        l3 = new Label(" ");
        l3.setBounds(30, 200, 200, 5000);
        t2 = new TextField();
        t2.setBounds(30, 200, 200, 20000);
        b1 = new Button("Login");
        b1.setBounds(80, 150, 60, 50);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        String user = "syit";
        String pass = "syit";
        int i = 0;
        if (count < 3) {
            if (s1.equals(user) && s2.equals(pass)) {
                l3.setText("Valid User!! Welcome!!");
            } else {
                count++;
                l3.setText("Invalid user!! Please try again!!");
            }
        } else {
            l3.setText("Tried three times Already!! Invalid!!");
            b1.setEnabled(false);
        }
    }
}
/* <applet code="Assignment345.class" width=500 height=500></applet> */
