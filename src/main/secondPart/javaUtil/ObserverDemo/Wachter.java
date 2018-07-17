package main.secondPart.javaUtil.ObserverDemo;

import java.util.Observable;
import java.util.Observer;

public class Wachter implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o);
		System.out.println("当前数字是:"+arg);

	}

}
