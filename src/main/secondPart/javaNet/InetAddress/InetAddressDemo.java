package main.secondPart.javaNet.InetAddress;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

import org.junit.Test;

public class InetAddressDemo {
	/**   
	 * @Title: InetAddress   
	 * @author:baijun
	 * @Description: InetAddress  没有构造器， 通过通常方式获得
	 * @date:2018年7月18日下午1:20:13      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.println(inetAddress);
			System.out.println(inetAddress.getHostName());
			System.out.println(Arrays.toString(inetAddress.getAddress()));
			System.out.println(inetAddress.getCanonicalHostName());
			System.out.println(inetAddress.isAnyLocalAddress());
			System.out.println(InetAddress.getLoopbackAddress());
			System.out.println(InetAddress.getByName(inetAddress.getHostAddress()));
			System.out.println(Arrays.toString(InetAddress.getAllByName(inetAddress.getHostName())));
			System.out.println(Arrays.toString(InetAddress.getAllByName(inetAddress.getHostAddress())));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	/**   
	 * @Title: Socket   
	 * @author:baijun
	 * @Description: tcp/ip 客户端套接字 
	 * @date:2018年7月18日下午1:38:49      
	 * void      
	 * @throws   
	 */
	@Test
	public void test2() {
		try {
			System.out.println("--------------指定地址---------------------");
			Socket socket = new Socket("localhost", 3306);
			System.out.println(socket);
			System.out.println(socket.getInetAddress());
			System.out.println(socket.getPort());
			System.out.println(socket.getLocalPort());
			System.out.println("--------------根据InetAddress---------------------");
			Socket s = new Socket(InetAddress.getLocalHost(),3306);
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test3() {
		try {
			Socket socket = new Socket("youpin.mi.com",80);
			System.out.println(socket);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			String str = "source=P_h69-x8ait";
			byte[] buff = str.getBytes();
			os.write(buff);
			int len = 0;
			while((len = is.read())>-1) {
				System.out.print((char)len);
			}
			System.out.println(socket.isConnected());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test4() {
		try {
			ServerSocket ss = new ServerSocket(8088);
			Socket socket = ss.accept();
			while(true) {
				OutputStream os = socket.getOutputStream();
				os.write("收到请回复".getBytes());
				os.flush();
				InputStream is = socket.getInputStream();
				int len =0;
				byte[] buff = new byte[1024];
				while((len=is.read(buff))>-1) {
					System.out.println(new String(buff));
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test5() {
		try {
			Socket socket = new Socket("localhost",8088);
			OutputStream os = socket.getOutputStream();
			os.write("我这里连接成功".getBytes());
			InputStream is = socket.getInputStream();
			int len =0;
			byte[] buff = new byte[1024];
			while((len=is.read(buff))>-1) {
				System.out.println(new String(buff));
			}
			
			os.flush();
			os.close();
			is.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
