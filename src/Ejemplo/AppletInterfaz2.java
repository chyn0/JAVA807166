/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplo;

import java.applet.Applet;
import java.awt.TextField;

/**
 *
 * @author Chyno
 */
public class AppletInterfaz2 extends Applet {
TextField t1, t2, t3, t4;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
            t1 = new TextField();
      t2 = new TextField(10);
      t3 = new TextField("Texto3");
      t4 = new TextField("Texto4",10);
      add(t1);
      add(t2);
      add(t3);
      add(t4);

        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
