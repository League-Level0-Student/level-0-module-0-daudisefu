package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Geeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hollworld");
		String input=JOptionPane.showInputDialog("what is your name");
		JOptionPane.showMessageDialog(null, "holl, "+input);
		
	}
}
