package main.secondPart.javaUtil.timerDemo;

import java.util.Date;
import java.util.Timer;

import org.junit.Test;

public class TimerDemo {
	@Test
	public void test1() throws InterruptedException {
		MyTimerTask my = new MyTimerTask();
		Timer t = new Timer();
		t.schedule(my, 1000,500);
		Thread.sleep(5000);
		t.cancel();
	}
	@Test
	public void test2() {
		MyTimerTask my = new MyTimerTask();
		Timer t = new Timer();
		t.schedule(my, new Date(),500);
		
	}

}
