package tn.com.neosoft.gestion_patient.tests;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFramePack {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setTitle("My First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Welcome");
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}
}