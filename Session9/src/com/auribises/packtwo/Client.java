package com.auribises.packtwo;

import com.auribises.packone.One;
//import com.auribises.packone.Two; // error
// default isnt accessible outside the package

class Three extends One{
	// private and default and constructor of One will not be inherited
	// protected and public will be inherited
	// protected after inheritance behaves as private
	
	void show(){
		protShow(); // calling protShow of One
	}
}

public class Client {

	public static void main(String[] args) {

		One oRef = new One();
		
		//errors
		//oRef.pvtShow(); 
		//oRef.defShow();
		//oRef.protShow();
		//oRef.pubShow();
		
		Three tRef = new Three();
		tRef.pubShow();
		//tRef.protShow();
		tRef.show();
	}

}
