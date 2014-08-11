package Tarea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author esp02
 */
public class BotonesApplet extends Applet {

    ///////////////////DECLARE VARIABLE////////////////
    Label lblnum1, lblnum2, lblre;
    TextField txtnum1, txtnum2, txtre;
    Button sum, rest, mult, div, raiz1, raiz2, mayor, clr;

    @Override
    public void init() {
        setSize(180, 250);//SET DIMENTION 

        ////////////////VARIABLE INITIALIZE///////////////////
        lblnum1 = new Label("Numero 1");
        lblnum2 = new Label("Numero 2");
        txtnum1 = new TextField("0", 8);
        txtnum2 = new TextField("0", 8);
        sum = new Button("Suma");
        rest = new Button("Resta");
        mult = new Button("Multiplica");
        div = new Button("Divide");
        raiz1 = new Button("Raiz de 1");
        raiz2 = new Button("Raiz de 2");
        mayor = new Button("Mayor");
        clr = new Button("Limpia");
        lblre = new Label("Resultado");
        txtre = new TextField(".00", 8);
        txtre.setEnabled(false);
        //////////////////ADD BUTTON/////////////////
        add(lblnum1);
        add(txtnum1);
        add(lblnum2);
        add(txtnum2);
        add(sum);
        add(rest);
        add(mult);
        add(div);
        add(raiz1);
        add(raiz2);
        add(mayor);
        add(clr);
        add(lblre);
        add(txtre);
        //////////////////ADD LISTENER///////////////////
        sum.addActionListener(new actionListenerOperaiconesBasicas());
        rest.addActionListener(new actionListenerOperaiconesBasicas());
        mult.addActionListener(new actionListenerOperaiconesBasicas());
        div.addActionListener(new actionListenerOperaiconesBasicas());
        raiz1.addActionListener(new actionListenerRaiz());
        raiz2.addActionListener(new actionListenerRaiz());
        mayor.addActionListener(new actionListenerOperaiconesBasicas());
        clr.addActionListener(new actionListenerOperaiconesBasicas());
    }


    private class actionListenerOperaiconesBasicas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(txtnum1.getText());
            double b = Double.parseDouble(txtnum2.getText());
            double re = 0;
            DecimalFormat df = new DecimalFormat("###,###.00");
            if (e.getSource() == sum) {
                re = a + b;
            } else if (e.getSource() == rest) {
                re = a - b;
            } else if (e.getSource() == mult) {
                re = a * b;
            } else if (e.getSource() == div) {
                if (b != 0 ) {               
                    re = a / b;
                }
            } else if (e.getSource() == mayor) {
                re = Math.max(a, b);
            } else if (e.getSource() == clr) {
                txtnum1.setText("0");
                txtnum2.setText("0");
                txtre.setText(".00");
            }
            txtre.setText("" + df.format(re));

        }
    }

    private class actionListenerRaiz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double re = 0;
            DecimalFormat df = new DecimalFormat("###,###.00");
            if (e.getSource() == raiz1 && !"".equals(txtnum1.getText())) {
                double a = Double.parseDouble(txtnum1.getText());
                re = Math.sqrt(a);
            } else if (e.getSource() == raiz2 && !"".equals(txtnum2.getText())) {
                double a = Double.parseDouble(txtnum2.getText());
                re = Math.sqrt(a);
            }
            txtre.setText("" + df.format(re));
        }
    }
   
}