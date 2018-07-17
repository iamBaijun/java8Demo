package main.secondPart.javaUtil.timerDemo;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println(this.getClass().getName()+"在这里执行任务");

	}

}
