package main.secondPart.javaUtil;

import java.util.StringTokenizer;

import org.junit.Test;

public class StringTokenizerDemo {
	@Test
	public void test1() {
		StringTokenizer str = new StringTokenizer(
				  "java=java is ok;"
				+ "php=php is no;","=;");
		while(str.hasMoreTokens()) {System.out.println(str.nextToken());}
	}

}
