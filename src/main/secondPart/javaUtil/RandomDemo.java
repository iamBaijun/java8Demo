package main.secondPart.javaUtil;

import java.util.Random;

import org.junit.Test;

public class RandomDemo {

	@Test
	public void test1() {
		int i=0;
		while(i<10) {
			System.out.println((char)(new Random().nextInt(26)+65));
			i++;
		}
	}
}
