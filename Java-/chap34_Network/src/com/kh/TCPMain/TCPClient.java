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
			//서버 주소와 포트 번호로 소켓 생성
			//서버 주소와 포트번호는 내가 연결하고자 하는 포트와 동일해야함
//			Socket socket = new Socket("1.221.120.194", 5200);
			Socket socket = new Socket("localhost", 5200);
			System.out.println("Server Connect");
			
			
			// 보낼때 
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			
			
			printStream.print("qweqwe");
			printStream.flush();
			
			// 서버로부터 읽음
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
