package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

// UDP Ŭ���̾�Ʈ
public class UDPClient {
	
	// start() UDP ������ �����ϴ� �޼��� ����ó���� �ʿ�
	public void start() throws Exception {
		// ������ ���� -> UDP ����� �̷���
		DatagramSocket dataSocket = new DatagramSocket();
		// ������ �����ϱ� ���� ���ϻ���
		// 127.0.0.1 = Local host Ŭ���̾�Ʈ�� ������ ���� ��ǻ�Ϳ��� ���� ���� ������ ����
		// Port Number������ server���� �����ϰ�, �������� ������ port�� ��
		
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		// InetAddress serverAddress = InetAddress.getAllByName("127.0.0.1");
													// all �� ���� Ȯ��
		// �����Ͱ� ����� ������ ������ ������  ũ��� byte �迭 ����
		byte[] msg = new byte[200];
		// ������ �����͸� ������ ���� ����
		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 9843);
		// ������ ���� �����͸� �����ϱ� ���� ����
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		// DatagramPacket �� ����
		dataSocket.send(outPacket);
		// DatagramPacket ����
		dataSocket.receive(inPacket);
		
		// ���ŵ� �����͸� ���ڿ��� ��ȯ�Ͽ� ������ ����ð��� ���
		System.out.println("������ ���� �ð� : " + new String(inPacket.getData()));
		
		// Ŭ���̾�Ʈ�� ������ �ݾ� ��������
		dataSocket.close();
	}
	
	public static void main(String[] args) {
		try {
			// UDP ���� ����
			new UDPClient().start();
//			new UDPClient.start(); error
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
