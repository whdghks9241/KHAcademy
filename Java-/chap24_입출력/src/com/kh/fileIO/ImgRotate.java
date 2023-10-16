package com.kh.fileIO;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\user1\\Desktop\\";
		
		String inputImg = path + "Cat.png";
		
		String outputImg = path + "Cat.png";
		
		// �̹����� �ε�
		try {
			BufferedImage originImg = ImageIO.read(new File(inputImg));
			
			// �̹����� 90�� �ð�������� ȸ��!
			BufferedImage rotateImg = rotateImage(originImg, 90);
			
			// ȸ���� �̹��� ����
			ImageIO.write(rotateImg, "png", new File(outputImg));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �̹����� �־��� ������ ȸ���ϴ� �޼���
	public static BufferedImage rotateImage(BufferedImage originImg, double degress) {
		double radians = Math.toRadians(degress);
		double sin = Math.abs(Math.sin(radians));
		double cos = Math.abs(Math.cos(radians));
		
		int width = originImg.getWidth();
		int height = originImg.getHeight();
		
		// ���ο� �̹��� ���� ������ �� ũ��
		int newWidth = (int) Math.floor(width * cos + height * sin);
		int newHeight = (int) Math.floor(height * cos + newWidth * sin);
		
		BufferedImage rotateImgBufferedImage = new BufferedImage(newWidth, newHeight, originImg.getType());
		Graphics2D g2d = rotateImgBufferedImage.createGraphics();
		
		g2d.translate((newWidth - width) / 2, (newHeight - height) / 2);
		g2d.rotate(radians, width/2, height /2);
		g2d.drawRenderedImage(originImg, null);
		g2d.dispose();
		
		return rotateImgBufferedImage;
	}

}
