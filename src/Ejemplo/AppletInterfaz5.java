/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplo;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Chyno
 */
public class AppletInterfaz5 extends Applet implements ItemListener{
   List ch1, ch2;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
   @Override
    public void init() {
              ch1 = new List();
      ch2 = new List();
      ch1.add("Primero");
      ch1.add("Segundo");
      ch1.add("Tercero",0);
      ch1.add("Cuarto",0);
      ch2.add("Uno");
      ch2.add("Dos");
      ch2.add("Tres");
      ch2.add("Cuatro");
      ch2.add("Cinco");
      add(ch1);
      add(ch2);
      ch1.addItemListener(this);
      ch2.addItemListener(this);

        // TODO start asynchronous download of heavy resources
    }
   @Override
    public void itemStateChanged(ItemEvent ie) {
      repaint();
   }
   @Override
   public void paint(Graphics g) {
      String msg = "Primera lista = ";
      msg += ch1.getSelectedItem();
      g.drawString(msg, 0,100);
      msg = "Segunda lista = ";
      msg += ch2.getSelectedItem();
      g.drawString(msg, 0,140);
   }


    // TODO overwrite start(), stop() and destroy() methods
}
