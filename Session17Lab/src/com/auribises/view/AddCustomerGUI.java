package com.auribises.view;

import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.auribises.db.JDBCHelper;
import com.auribises.model.Customer;


public class AddCustomerGUI implements ActionListener{
	
	JFrame fr; // reference variable which will point to the object of Frame
	
	JLabel lblTitle, lblName, lblPhone, lblEmail, lblAge;
	
	JTextField txtName, txtPhone, txtEmail, txtAge;
	
	JButton btnAddCustomer, btnCancel;
	
	JPanel pnlTitle, pnlName, pnlPhone, pnlEmail, pnlAge, pnlButton, pnlAll;
	
	Customer cRef;
	
	/*JRadioButton rbMale, rbFemale;
	CheckboxGroup group;
	JCheckBox cbCpp,cbJava,cbPython;
	JComboBox<String> cbxCity;*/
	
	
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
		
//		rbMale = new JRadioButton("Male");
//		rbFemale = new JRadioButton("Female");
		
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
			
			/*cRef.name = txtName.getText();
			cRef.phone = txtPhone.getText();
			cRef.email = txtEmail.getText();
			cRef.age = Integer.parseInt(txtAge.getText());
			
			System.out.println(cRef);
			
			// Add Customer to DB
			JDBCHelper helper = new JDBCHelper();
			helper.createConnection();
			int i = helper.addCustomer(cRef);
			if(i>0){
				lblTitle.setText(cRef.name+" Added !!");
				txtName.setText("");
				txtPhone.setText("");
				txtEmail.setText("");
				txtAge.setText("");
			}else{
				lblTitle.setText("Some Problem!! Try Again !!");
			}
			helper.closeConnection();	*/
			
			JDBCHelper helper = new JDBCHelper();
			helper.createConnection();
			ArrayList<Customer> customers = helper.queryCustomers();
			helper.closeConnection();
			
			for(Customer cRef : customers){
				System.out.println(cRef);
			}
			
		}else{
			fr.dispose();
		}
	}


}
