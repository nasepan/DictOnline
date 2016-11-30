import java.io.*;
import java.net.*;
import java.util.*;

public class server 
{
	
	public server()
	{
		try 
		{
			ServerSocket serverSocket = new ServerSocket(8000);
			int clientnum = 1;
			while(true)
			{
				Socket socket = serverSocket.accept(); 
				InetAddress inetAddress = socket.getInetAddress();            //获取主机名和ip地址
				HandleAClient task = new HandleAClient(socket);				//该线程实现功能
				new Thread(task).start();
				clientnum++;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	//类初始化end
	
	//处理一个client请求
	class HandleAClient implements Runnable
	{
		private Socket socket;
		public HandleAClient(Socket socket)
		{
			this.socket = socket;
		}
		
		//run a thread
		public void run()
		{
			try 
			{
				ObjectInputStream inputFromClient = new ObjectInputStream(socket.getInputStream());
				Object object = inputFromClient.readObject();							//读取input类存入object类用作后续操作。
				/*统一输入后将类中的数据存入数据库或者从数据库中读取文件
				*/
				
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			} 
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
}
