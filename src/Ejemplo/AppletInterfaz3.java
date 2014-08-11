/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplo;

import java.applet.Applet;
import java.awt.Button;

/**
 *
 * @author Chyno
 */
public class AppletInterfaz3 extends Applet {
Button b1, b2;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
             b1 = new Button();
      b2 = new Button("boton2");
      add(b1);
      add(b2);

        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
