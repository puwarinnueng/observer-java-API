/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author nueng
 */
public class Marketing implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(
	 arg + "(marketing) headquater is updated to " 
                + ((HeadQuater)o).getSomeData());
    }
}