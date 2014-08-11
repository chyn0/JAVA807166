/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplo;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextField;

/**
 *
 * @author Chyno
 */
public class AppletInterfaz8 extends Applet {
Button b1, b2, b3;
   TextField t1, t2;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
@Override
    public void init() {
              setLayout(new BorderLayout());
      t1 = new TextField("a");
      t2 = new TextField("b");
      b1 = new Button("b1");
      b2 = new Button("b2");
      b3 = new Button("b3");
      add(t1, BorderLayout.NORTH);
      add(t2, BorderLayout.EAST);
      add(b1, BorderLayout.WEST);
      add(b2, BorderLayout.SOUTH);
      add(b3, BorderLayout.CENTER);

        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
