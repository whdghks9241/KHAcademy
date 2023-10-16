package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Model View Controller
		// model = CalculatorModel ��������
		// view = CalculatorView ��������
		// Controller CalculatorController ��������

		CalculatorModel model = new CalculatorModel();
		
		CalculatorView view = new CalculatorView();
		
		CalculatorController controller = new CalculatorController(model, view);
		
		controller.run();
	}

}
