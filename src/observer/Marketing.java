
package observer;

import java.util.Observable;
import java.util.Observer;


public class Marketing implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(
	 arg + "(marketing) headquater is updated to " 
                + ((HeadQuater)o).getSomeData());
    }
}