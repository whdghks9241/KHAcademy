package com.kh.TCPMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		try {
			//���� �ּҿ� ��Ʈ ��ȣ�� ���� ����
			//���� �ּҿ� ��Ʈ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ�� �����ؾ���
//			Socket socket = new Socket("1.221.120.194", 5200);
			Socket socket = new Socket("localhost", 5200);
			System.out.println("Server Connect");
			
			
			// ������ 
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			
			
			printStream.print("qweqwe");
			printStream.flush();
			
			// �����κ��� ����
			InputStream InStream = socket.getInputStream();
			Scanner sc = new Scanner(InStream);
			System.out.println("[Client] server : " + sc.nextLine());
			
			socket.close();
			System.out.println("Byte Server See you later!! ");
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
