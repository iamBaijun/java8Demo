package main.secondPart.javaLong.process;

import java.io.IOException;

import org.junit.Test;

public class ProcessBuilderDemo {
	
	@Test
	public void test1() throws IOException {
		ProcessBuilder p = new ProcessBuilder("notepad.exe","F:// textfile");
		p.start();
		
		
	}

}
