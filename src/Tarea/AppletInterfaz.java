/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Chyno
 */
public class AppletInterfaz extends Applet implements ItemListener {

    List l1;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        setSize(370, 380);
        l1 = new List();
        l1.add("White");
        l1.add("Gray");
        l1.add("Dark Gray");
        l1.add("Cyan");
        l1.add("Black");
        l1.add("Red");
        l1.addItemListener(this);
        add(l1);
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Color c = Color.WHITE;
        
        if (l1.getSelectedIndex() == 0) {
            c = Color.WHITE;
        } else if (l1.getSelectedIndex() == 1) {
            c = Color.GRAY;
        } else if (l1.getSelectedIndex() == 2) {
            c = Color.DARK_GRAY;
        } else if (l1.getSelectedIndex() == 3) {
            c = Color.CYAN;
        } else if (l1.getSelectedIndex() == 4) {
            c = Color.BLACK;
        } else if (l1.getSelectedIndex() == 5) {
            c = Color.RED;
        }

        g.drawRect(this.getX(), this.getY(), this.getHeight(), this.getWidth());
        g.setColor(c);
        g.fillRect(this.getX(), this.getY(), this.getHeight(), this.getWidth());

    }
}
