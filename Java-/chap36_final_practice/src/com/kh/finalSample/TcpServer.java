package com.kh.finalSample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {

	public static void main(String[] args) {
		int port = 1414;
		
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			System.out.println("������ ��Ʈ " + port + " ���� ���� ���Դϴ�.");
			
			
			while(true) {

				// Ŭ���̾�Ʈ ����
				Socket client = server.accept();
				System.out.println("Ŭ���̾�Ʈ ���� : " + client.getInetAddress());
				
				
				client.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
