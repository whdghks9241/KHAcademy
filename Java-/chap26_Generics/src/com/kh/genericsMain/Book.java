package com.kh.genericsMain;

// ���ʸ� Ŭ���� ����
public class Book<T> {
	
	T content;
	public void put(T item) {
		
		this.content = item;
	}
	
	public T get() {
		return content;
	}
	
}
