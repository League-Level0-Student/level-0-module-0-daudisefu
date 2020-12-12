package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String input =JOptionPane.showInputDialog("do know whow towr it code");
		// 1. Ask the user if they know how to write code.
		if(input.equals("yes")) {
			JOptionPane.showMessageDialog(null,"thall you will rule the world");
		}
		// 2. If they say "yes", tell them they will rule the world.
		else {
			JOptionPane.showMessageDialog(null,"sing up for classes at the League");
		}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

