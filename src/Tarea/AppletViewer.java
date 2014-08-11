/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 *
 * @author Chyno
 */
public class AppletViewer extends Applet implements AdjustmentListener {

    Scrollbar sbred, sbgreen, sbblue;
    Label lblred, lblgreen, lblblue;
    Panel p1, p2;

    @Override
    public void init() {
        setSize(245, 250);
        setLayout(new FlowLayout());
        sbred = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        sbgreen = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        sbblue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);

        lblred = new Label("red = " + sbred.getValue());
        lblgreen = new Label("green = " + sbgreen.getValue());
        lblblue = new Label("blue = " + sbblue.getValue());

        p1 = new Panel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        sbred.addAdjustmentListener(this);
        sbgreen.addAdjustmentListener(this);
        sbblue.addAdjustmentListener(this);
        p1.add(sbred);
        p1.add(sbgreen);
        p1.add(sbblue);

        p2 = new Panel();
        p2.setLayout(new GridLayout(4, 2, 5, 10));
        p2.add(lblred);
        p2.add(lblgreen);
        p2.add(lblblue);

        add(p1);
        add(p2);

    }

    @Override
    public void paint(Graphics g) {
        Color c = new Color(sbred.getValue(), sbgreen.getValue(), sbblue.getValue());
        g.drawRect(this.getX(), this.getY(), this.getHeight(), this.getWidth());
        g.setColor(c);
        g.fillRect(this.getX(), this.getY(), this.getHeight(), this.getWidth());
//        setBackground(c);
        p1.setBackground(c);
        p2.setBackground(c);
        lblred.setBackground(c);
        lblgreen.setBackground(c);
        lblblue.setBackground(c);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {

        lblred.setText("red = " + sbred.getValue());
        lblgreen.setText("green = " + sbgreen.getValue());
        lblblue.setText("blue = " + sbblue.getValue());
        repaint();

    }

}
