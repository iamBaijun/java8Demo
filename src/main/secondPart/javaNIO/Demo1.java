package main.secondPart.javaNIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import main.secondPart.javaIo.FileUtil;

/**   
 * @ClassName:  Demo1   
 * @Description:java.nio 读取文件1  
 * @author: baijun 
 * @date:   2018年7月17日 下午2:43:50   
 *     
 * @Copyright: 2018  
 */  
public class Demo1 {
	public static void main(String[] args) {
		int len = 0;
		Path filePath = null; 
		try{
			filePath = Paths.get(FileUtil.PATH);	
		}catch(Exception e) {e.printStackTrace();}
		
		try(SeekableByteChannel sbc = Files.newByteChannel(filePath)) {//获取甬道
			ByteBuffer bb = ByteBuffer.allocate(128);//分配缓冲区大小
			do {
				len = sbc.read(bb);
				if(len != -1) {
					bb.rewind();
					byte[] buff = new byte[128];
					for(int i=0;i<len;i++) {
						buff[i] = bb.get();
					}
					System.out.println(new String(buff));
				}
				
			}while(len != -1);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
