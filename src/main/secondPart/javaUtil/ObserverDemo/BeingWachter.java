package main.secondPart.javaUtil.ObserverDemo;

import java.util.Observable;

public class BeingWachter extends Observable {
	
	public void cunter(int num) throws InterruptedException {
		for(;num>=0;num--) {
			setChanged();
			notifyObservers(num);
			Thread.sleep(1000);
		}
	}

}
