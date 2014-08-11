/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplo;

import java.applet.Applet;
import java.awt.TextArea;

/**
 *
 * @author Chyno
 */
public class AppletInterfaz6 extends Applet {
 TextArea ta1, ta2, ta3;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
              ta1 = new TextArea();
      ta2 = new TextArea("",10,12,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
      ta3 = new TextArea("",5,5,TextArea.SCROLLBARS_BOTH);
      add(ta1);
      add(ta2);
      add(ta3);

        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
