package main.secondPart.javaNIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

import main.secondPart.javaIo.FileUtil;

/**   
 * @ClassName:  Demo2   
 * @Description:将文件映射到缓冲区   
 * @author: baijun 
 * @date:   2018年7月17日 下午3:02:50   
 *     
 * @Copyright: 2018  
 */  
public class Demo2 {

	public static void main(String[] args) throws IOException {
		try(
			FileChannel fc = (FileChannel) Files.newByteChannel(Paths.get(FileUtil.PATH))
			){
			long size = fc.size();
			MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_ONLY, 0, size);
			
			for(int i=0;i<size;i++) {
				System.out.print((char)mbb.get());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
