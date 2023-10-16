package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
	
	public static void main(String[] args) {
		
		int port = 1414;
		String serverIP;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, 1414);
			
			System.out.println("server connect");
			
			// Ŭ���̾�Ʈ�� ����� ���� �� ��� ��Ʈ�� ����
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStream out = socket.getOutputStream();
			
			// Ŭ���̾�Ʈ���� ������ �޼��� ����
			String msg = "�ȳ��ϼ���";
			out.write(msg.getBytes());
			out.flush();
			
			socket.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
