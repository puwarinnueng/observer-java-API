
package observer;

import java.util.Observer;


public class ObserverInJavaApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Senior obj1 = new Senior();
	Marketing obj2 = new Marketing();
	HeadQuater observable = new HeadQuater();              
	observable.addObserver(obj1);              
	observable.addObserver(obj2);              
	observable.setSomeData(6);
        observable.setSomeData(7);
    }

}