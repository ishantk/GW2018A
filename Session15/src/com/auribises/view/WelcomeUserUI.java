package com.auribises.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.auribises.model.User;

public class WelcomeUserUI implements ActionListener{

	JFrame fr; // reference variable which will point to the object of Frame
	
	JLabel lblTitle, lblName, lblEmail, lblPassword;
	
	JTextField txtName, txtEmail, txtPassword;
	//JPasswordField password;
	
	JButton btnRegister, btnCancel;
	
	JPanel pnlTitle, pnlName, pnlEmail, pnlPassword, pnlButton, pnlAll;
		
	public WelcomeUserUI() {
			
		fr = new JFrame("Welcome");
		//fr.setTitle("Welcome");
		
		lblTitle = new JLabel();
		
		btnCancel = new JButton("Cancel");
	
		btnCancel.addActionListener(this);
		
		pnlTitle = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
		
	}
	
	public WelcomeUserUI(User uRef) {
				
		fr = new JFrame("Welcome");
		//fr.setTitle("Welcome");
		
		lblTitle = new JLabel();
		lblTitle.setText("Welcome, "+uRef.name+"\nYour Email is: "+uRef.email);
		
		btnCancel = new JButton("Cancel");
	
		btnCancel.addActionListener(this);
		
		pnlTitle = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
		
	}
	
	public void showUI(){
		
		pnlTitle.add(lblTitle);
		
		pnlButton.add(btnCancel);
		
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(2, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		//fr.setSize(400, 400);
		fr.pack();
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cancel Clicked");
		fr.dispose();
	}

	
}
