package Ejemplo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Label;

/**
 *
 * @author Chyno
 */
public class AppletInterfaz1 extends Applet {
Label l1, l2, l3;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
            l1 = new Label();
      l2 = new Label("etiqueta 2");
      l3 = new Label("etiqueta 3", Label.CENTER);
      add(l1);
      add(l2);
      add(l3);

        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
