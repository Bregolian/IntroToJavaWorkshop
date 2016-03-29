package day3;

import javax.swing.JOptionPane;

public class Stalker {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("What's your full name?");
	String address=JOptionPane.showInputDialog("Where do you live");
	String siblings=JOptionPane.showInputDialog("How many siblings do you have?");
	String parent=JOptionPane.showInputDialog("What are your parent's full names?");
	String social=JOptionPane.showInputDialog("What's your social security number?");
	String phone=JOptionPane.showInputDialog("What's your phone number?");
	JOptionPane.showInputDialog(null, "Hello "+name+"resident of "+address+"with "+siblings+"siblings. Your parent's are "+parent);
}
}
