package com.Interface;

public class milage implements cars {

	@Override
	public void brezza() {
		System.out.println("10kmpl");
		
	}

	@Override
	public void swift() {
		System.out.println("15kmpl");
		
	}

	@Override
	public void verna() {
		System.out.println("20kmpl");
		
	}
	public static void main(String[] args) {
		milage m = new milage();
		m.brezza();
		m.swift();
		m.verna();
	}

}
