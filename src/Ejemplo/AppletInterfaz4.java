/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplo;

import java.applet.Applet;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Chyno
 */
public class AppletInterfaz4 extends Applet implements ItemListener{
Choice ch1, ch2;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
@Override
    public void init() {    
        ch1 = new Choice();
      ch2 = new Choice();
      ch1.add("Primero");
      ch1.add("Segundo");
      ch1.add("Tercero");
      ch1.add("Cuarto");
      ch2.add("Uno");
      ch2.add("Dos");
      ch2.add("Tres");
      ch2.add("Cuatro");
      ch2.add("Cinco");
      ch1.select("Cuarto");
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
      String msg = "Primer menu = ";
      msg += ch1.getSelectedItem();
      g.drawString(msg, 0,100);
      msg = "Segundo menu = ";
      msg += ch2.getSelectedItem();
      g.drawString(msg, 0,140);
   }

    // TODO overwrite start(), stop() and destroy() methods
}
