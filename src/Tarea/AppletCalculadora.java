/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.BoxLayout;

/**
 *
 * @author Chyno
 */
public class AppletCalculadora extends Applet {

    TextField t1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    Panel p1;
    Panel p2;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        setLayout(new BorderLayout(10,10));
        
        p1 = new Panel(new GridLayout(1, 1));
        p2 = new Panel(new GridLayout(6, 3, 10, 10));
        t1 = new TextField();
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button(".");
        b11 = new Button("0");
        b12 = new Button("CE");
        b13 = new Button("+");
        b14 = new Button("-");
        b15 = new Button("=");
        b16 = new Button("*");
        b17 = new Button("/");
        b18 = new Button("C");

        p1.add(t1);

      
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
  add(p1, BorderLayout.NORTH);
  add(p2, BorderLayout.CENTER);
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
