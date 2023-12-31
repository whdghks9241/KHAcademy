package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

// 주문객체
public class Order implements FoodStore{

	private List<Menu> OrderMenus;

	public Order() {
		OrderMenus = new ArrayList<>();
		
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		
		OrderMenus.add(menuA);
	}

	public void removeMenu(String menu) {
		System.out.println(menu);
	}


	public void printMenu() {
		System.out.println("주문내역");

		for (Menu m : OrderMenus) {
			System.out.println(m.getItem() + " ");
		}
	}	
}
