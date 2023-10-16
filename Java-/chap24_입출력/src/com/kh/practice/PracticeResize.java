package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 1.
		 �̹��� �ϳ� �ҷ�����
		 ���� �������� �� �̹��� ����ȭ�鿡 �����ϱ�
		 
		 2.
		 �̹��� �ϳ� �ҷ�����
		 ����ȭ�鿡 ���ο� ���� ����� mkdir
		 ���ο� ���������� �̹��� ����ȭ�鿡 ���� ���� ���� �ȿ� �����ϱ�
		 
		 */
		
		PracticeResize pr = new PracticeResize();
		pr.imgResize();
	}
	
	public void imgResize() {
		// ���� �ּ�
		String path = "C:\\Users\\user1\\Desktop\\";
		// ������ ������ �ּ�
		String makeFolderPath = path + "reSizeImg\\";
		
		// ���� �̹����� ��ġ
		String inputImg = path + "Cat.png";
		// ������ ������ �̹����� ��ġ
		String outputImg = makeFolderPath + "cuteCat.png";
		
		// ����ũ��
		int width = 300;
		// ���α���
		int height = 400;

		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));

			// ���ο� ũ��� �̹��� ����
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);

			// BufferedImage�� ��ȯ
			BufferedImage bufResizeImg = new BufferedImage(width, height,BufferedImage.TYPE_INT_BGR);

			Boolean success = bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			
			
			if (success) {
				File folder = new File(makeFolderPath);
				
				folder.mkdir();
				if(!folder.exists()) {
					folder.mkdir();
					System.out.println("������ ���������� �����Ǿ����ϴ�.");
					
				}
				
				ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
				
				System.out.println("�̹��� ������ ���� �Ϸ�");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�̹��� ������ ���� �� ���� �߻� : " +e.getMessage());
		}
	}

}
