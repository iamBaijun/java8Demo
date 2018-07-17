package main.secondPart.javaUtil.ObserverDemo;

import org.junit.Test;

public class TestDemo {

	@Test
	public void test1() throws InterruptedException {
		BeingWachter b = new BeingWachter();
		b.addObserver(new Wachter());
		b.cunter(10);
	}
}
