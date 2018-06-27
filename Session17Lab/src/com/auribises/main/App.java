package com.auribises.main;

import com.auribises.view.AddCustomerGUI;

public class App {

	public static void main(String[] args) {
		System.out.println("==App Started==");

		AddCustomerGUI gui = new AddCustomerGUI();
		gui.showUI();
		
		System.out.println("==App Finished==");
	}

}
