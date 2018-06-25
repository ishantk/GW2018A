package com.auribises.view;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.auribises.model.User;

/*
 * Queries ??

GUI

	Model
		Represents Data
		Object Containing Data
		Persist the Model -> Serialization/DB
	
	View 
		UI | user Interface

	Controller
		A class having logical part in the form of methods


	GUI
		java.awt
		javax.swing	

		Window
			Frame

		Container	
			Panel

		Components
			Label
			TextField	
			Button
			RadioButton
			CheckBox
			ComboBox
			Menu
			.
			..
			....
			......

		Layout
			Arrangement of how views(components) will be placed in Frame	

		Use Case:
			Register a User

			User
				name
				email
				password	
 */

public class RegisterUserUI implements ActionListener{
	
	Frame fr; // reference variable which will point to the object of Frame
	
	Label lblTitle, lblName, lblEmail, lblPassword;
	
	TextField txtName, txtEmail, txtPassword;
	
	Button btnRegister, btnCancel;
	
	Panel pnlTitle, pnlName, pnlEmail, pnlPassword, pnlButton, pnlAll;
	
	User uRef;
	
	public RegisterUserUI() {
		
		uRef = new User();
		
		fr = new Frame("Welcome");
		//fr.setTitle("Welcome");
		
		lblTitle = new Label("Please Enter Your Details !!");
		lblName = new Label();
		lblName.setText("Enter Your Name");
		lblEmail = new Label("Enter Your Email");
		lblPassword = new Label("Enter Your Password");
		
		txtName = new TextField(14);
		txtEmail = new TextField(14);
		txtPassword = new TextField(14);
		
		btnRegister = new Button("Register");		
		//btnRegister.setLabel("Register");
		btnCancel = new Button("Cancel");
		
		btnRegister.addActionListener(this);
		btnCancel.addActionListener(this);
		
		pnlTitle = new Panel();
		pnlName = new Panel();
		pnlEmail = new Panel();
		pnlPassword = new Panel();
		pnlButton = new Panel();
		pnlAll = new Panel();
		
	}
	
	public void showUI(){
		
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlPassword.add(lblPassword);
		pnlPassword.add(txtPassword);
		
		pnlButton.add(btnRegister);
		pnlButton.add(btnCancel);
		
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlPassword);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(5, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		//fr.setSize(400, 400);
		fr.pack();
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRegister){
			System.out.println("Register Clicked");
			
			uRef.name = txtName.getText();
			uRef.email = txtEmail.getText();
			uRef.password = txtPassword.getText();
				
			
			System.out.println(uRef);
				
		}else{
			System.out.println("Cancel Clicked");
			fr.dispose();
		}
	}

}
