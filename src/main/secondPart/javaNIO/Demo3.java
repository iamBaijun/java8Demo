package main.secondPart.javaNIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

import main.secondPart.javaIo.FileUtil;

public class Demo3 {
	@Test
	public void test1() {
		//将文件读取到甬道
		try(FileChannel fc = (FileChannel)Files.newByteChannel(Paths.get(FileUtil.PATH),
				StandardOpenOption.WRITE,StandardOpenOption.CREATE)){
			
			ByteBuffer bb = ByteBuffer.allocate(26);
			
			for(int i=0;i<26;i++) {
				bb.put((byte)('A'+i));
				
			}
			bb.rewind();
			fc.write(bb);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
