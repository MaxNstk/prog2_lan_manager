
package views;

import interfaces.IView;

/**
 *
 * @author petrix
 */
abstract public class View extends javax.swing.JFrame implements IView{

    protected void ajustScreenCenter() {
        setTitleScreen();
        setLocationRelativeTo(null);
    }
    
}