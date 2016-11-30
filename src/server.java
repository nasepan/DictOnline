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
				InetAddress inetAddress = socket.getInetAddress();            //��ȡ��������ip��ַ
				HandleAClient task = new HandleAClient(socket);				//���߳�ʵ�ֹ���
				new Thread(task).start();
				clientnum++;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	//���ʼ��end
	
	//����һ��client����
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
				Object object = inputFromClient.readObject();							//��ȡinput�����object����������������
				/*ͳһ��������е����ݴ������ݿ���ߴ����ݿ��ж�ȡ�ļ�
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
