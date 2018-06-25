package com.auribises.main;

import com.auribises.view.RegisterUserUI;
import com.auribises.view.RegisterUserUISwing;

public class App {

	public static void main(String[] args) {
		System.out.println("==App Started==");
		//RegisterUserUI uRef = new RegisterUserUI();
		//uRef.showUI();
		
		RegisterUserUISwing swing = new RegisterUserUISwing();
		swing.showUI();
		
		System.out.println("==App Finished==");
	}

}
