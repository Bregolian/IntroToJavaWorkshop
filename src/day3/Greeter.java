package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("My name is Max what's yours?");
	JOptionPane.showMessageDialog(null,"Hello "+name);
	String age=JOptionPane.showInputDialog("How old are you?");
}
}
