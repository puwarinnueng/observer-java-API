
package observer;

import java.util.Observable;


public class HeadQuater extends Observable {
    private int someData;

    public void setSomeData(int aData) {
	someData = aData;
        setChanged();
	notifyObservers("From HeadQuater");
    }
    public int getSomeData() {
	return someData;
    }
}