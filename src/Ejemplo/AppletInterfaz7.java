/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplo;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextField;

/**
 *
 * @author Chyno
 */
public class AppletInterfaz7 extends Applet {
Button b1, b2, b3, b4, b5;
   TextField t1, t2, t3, t4, t5;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
@Override
    public void init() {
      setLayout(new GridLayout(4, 3, 10, 10));
      t1 = new TextField("a");
      t2 = new TextField("b");
      t3 = new TextField("c");
      t4 = new TextField("d");
      t5 = new TextField("e");
      b1 = new Button("b1");
      b2 = new Button("b2");
      b3 = new Button("b3");
      b4 = new Button("b4");
      b5 = new Button("b5");
      
      add(t1);
      add(t2);
      add(t3);
      add(t4);
      add(t5);
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);

        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
