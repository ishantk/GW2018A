package com.auribises;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUI implements ActionListener, MouseListener, MouseMotionListener, WindowListener, FocusListener{
	
	JFrame fr;
	JMenuBar menuBar;
	JMenu menu1,menu2;
	JMenuItem item1,item2,item3,item4;
	
	GUI(){
		fr = new JFrame("MyFrame");
		
		menuBar = new JMenuBar();
		
		menu1 = new JMenu("File");
		menu2 = new JMenu("Edit");
		
		item1 = new JMenuItem("Open");
		item2 = new JMenuItem("Save");
		
		item3 =  new JMenuItem("Copy");
		item4 =  new JMenuItem("Paste");
		
	}
	
	void showUI(){
		
		menu1.add(item1);
		menu1.add(item2);
		
		menu2.add(item3);
		menu2.add(item4);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		
		fr.setJMenuBar(menuBar);
		
		item1.addActionListener(this);
		
		fr.addMouseListener(this);
		fr.addMouseMotionListener(this);
		fr.setSize(400, 400);
		fr.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("==mouseClicked=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("==mousePressed=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("==mouseReleased=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == fr){
			System.out.println("==mouseEntered=="+e.getX()+" : "+e.getY());
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("==mouseExited=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("==mouseDragged=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("==mouseMoved=="+e.getX()+" : "+e.getY());
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == item1){
			System.out.println("Open Clicked");
		}
	}

}
