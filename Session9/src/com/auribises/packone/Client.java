package com.auribises.packone;

public class Client {

	public static void main(String[] args) {
		
		One oRef = new One();
		Two tRef = new Two();
		
		// oRef.pvtShow(); err
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		// tRef.pvtShow(); err
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}
