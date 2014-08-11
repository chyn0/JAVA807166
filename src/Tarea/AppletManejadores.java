/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author Chyno
 */
public class AppletManejadores extends Applet {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        setLayout(new GridLayout(5, 3, 10, 10));
        l1 = new Label("X");
        l2 = new Label("Y");
        l3 = new Label("RESULTADO");
        t1 = new TextField("0");
        t2 = new TextField("0");
        t3 = new TextField(".00");
        t3.setEditable(false);
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("Raiz x");
        b6 = new Button("Raiz y");
        b7 = new Button("x a la y");
        b8 = new Button("y a la x");
        b9 = new Button("x mod y");
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        b1.addActionListener(new actionListenerOperaiconesBasicas());
        b2.addActionListener(new actionListenerOperaiconesBasicas());
        b3.addActionListener(new actionListenerOperaiconesBasicas());
        b4.addActionListener(new actionListenerOperaiconesBasicas());
        b5.addActionListener(new actionListenerRaiz());
        b6.addActionListener(new actionListenerRaiz());
        b7.addActionListener(new actionListenerOperaiconesBasicas());
        b8.addActionListener(new actionListenerOperaiconesBasicas());

        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    private class actionListenerOperaiconesBasicas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double re = 0;
            DecimalFormat df = new DecimalFormat("###,###.00");
            if (e.getSource() == b1) {
                re = a + b;
            } else if (e.getSource() == b2) {
                re = a - b;
            } else if (e.getSource() == b3) {
                re = a * b;
            } else if (e.getSource() == b4) {
                if (b != 0) {
                    re = a / b;
                }
            } else if (e.getSource() == b7) {
                re = Math.pow(a, b);
            } else if (e.getSource() == b8) {
                re = Math.pow(b, a);
            } else if (e.getSource() == b9) {
                re = a % b;
            }

            t3.setText("" + df.format(re));

        }
    }

    private class actionListenerRaiz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double re = 0;
            DecimalFormat df = new DecimalFormat("###,###.00");
            if (e.getSource() == b5 && !"".equals(t1.getText())) {
                double a = Double.parseDouble(t1.getText());
                re = Math.sqrt(a);
            } else if (e.getSource() == b3 && !"".equals(t2.getText())) {
                double a = Double.parseDouble(t2.getText());
                re = Math.sqrt(a);
            }
            t3.setText("" + df.format(re));
        }
    }
}
