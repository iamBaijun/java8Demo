package main.secondPart.javaUtil.formatterDemo;

import java.util.Formatter;

import org.junit.Test;

public class FormatterDemo {

	@Test
	public void test1() {
		Formatter fmt = new Formatter();
		fmt.format("%,.2f",111111111.11);
		System.out.println(fmt);
	}
}
