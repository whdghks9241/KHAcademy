package com.kh.TCPMain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(12345);
			System.out.println("Server Waiting");
			
			// ���� Ŭ���̾�Ʈ�� �����ϰ� �ʹٸ� Ŭ���̾�Ʈ�� �����ϴ� �ڵ� �ۼ�
			while(true) {
				Socket client = serverSocket.accept();
				System.out.println("Connect Clinent. ");
				
				// �о�� �� 
				InputStream instream = client.getInputStream();
				Scanner sc = new Scanner(instream);
				
				System.out.println("Server | Client  : " + sc.nextLine());
				
				OutputStream outStream = client.getOutputStream();
				PrintStream printStream = new PrintStream(outStream);
				
				printStream.print(" Hi Client ");
				System.out.println("Server | Client");
				// ������ �����͸� �ѹ��� ��Ƴ�
				printStream.flush();
				
				client.close();
				System.out.println("Server " + client.getInetAddress() );
				
				
				// ���� ������ ���Ѵ�� ������ �Ǿ�� �ϳ�
				// ���� ������ �ְ� ���� ��
				int count = 1;
				if (count > 10) {
					serverSocket.close(); // ������ ����
					System.out.println("Server Close");
				}
				
				count += 1;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
