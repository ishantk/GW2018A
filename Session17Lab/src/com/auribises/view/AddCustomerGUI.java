package com.auribises.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.auribises.model.Customer;


public class AddCustomerGUI implements ActionListener{
	
	JFrame fr; // reference variable which will point to the object of Frame
	
	JLabel lblTitle, lblName, lblPhone, lblEmail, lblAge;
	
	JTextField txtName, txtPhone, txtEmail, txtAge;
	
	JButton btnAddCustomer, btnCancel;
	
	JPanel pnlTitle, pnlName, pnlPhone, pnlEmail, pnlAge, pnlButton, pnlAll;
	
	Customer cRef;
	
	public AddCustomerGUI() {
		
		cRef = new Customer();
		
		fr = new JFrame("Add Customer");
		
		lblTitle = new JLabel("Please Enter Details if Customer !!");
		
		lblName = new JLabel();
		lblName.setText("Enter Customer Name");
		
		lblPhone = new JLabel();
		lblPhone.setText("Enter Customer Phone");
		
		lblEmail = new JLabel("Enter Customer Email");
		lblAge = new JLabel("Enter Customer Age");
		
		txtName = new JTextField(14);
		txtPhone = new JTextField(14);
		txtEmail = new JTextField(14);
		txtAge = new JTextField(14);
		
		btnAddCustomer = new JButton("Add Customer");		
		btnCancel = new JButton("Cancel");
		
		btnAddCustomer.addActionListener(this);
		btnCancel.addActionListener(this);
		
		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlPhone = new JPanel();
		pnlEmail = new JPanel();
		pnlAge = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
		
	}
	
	public void showUI(){
		
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlPhone.add(lblPhone);
		pnlPhone.add(txtPhone);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlAge.add(lblAge);
		pnlAge.add(txtAge);
		
		pnlButton.add(btnAddCustomer);
		pnlButton.add(btnCancel);
		
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlPhone);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlAge);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(6, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		//fr.setSize(400, 400);
		fr.pack();
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAddCustomer){
			
			cRef.name = txtName.getText();
			cRef.phone = txtPhone.getText();
			cRef.email = txtEmail.getText();
			cRef.age = Integer.parseInt(txtAge.getText());
			
			System.out.println(cRef);
				
		}else{
			fr.dispose();
		}
	}


}
