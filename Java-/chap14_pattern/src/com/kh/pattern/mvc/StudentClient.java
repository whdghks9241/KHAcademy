package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.StudentController;
import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentClient {

	public static void main(String[] args) {

		// �� ��ü ���� Model
		StudentModel model = new StudentModel("�л�1��", 18);
		// �� ��ü ���� View
		StudentView view = new StudentView();
		// ��Ʈ�ѷ� ��ü ���� Controller(�� �� ����)
		StudentController controller = new StudentController(model, view);
		// �л� ������ ������Ʈ �ؼ� ���
		controller.updateView();
		// �л� ���� ������Ʈ�� ����!
		controller.setStudentName("2��");
		// ������Ʈ �� �л� ������ ���.
		controller.setStudentAge(18);
		controller.updateView();
	}

}
