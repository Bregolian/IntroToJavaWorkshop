package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
speak("Whiteboard");
String spell=JOptionPane.showInputDialog("Spell it");
		// 3. If the user spelled the word correctly, speak "correct"
if(spell.equalsIgnoreCase("whiteboard")){
	speak("correct");
}	
else
	speak("incorrect");
speak("Hello");
String spell_2=JOptionPane.showInputDialog("Spell it");
		// 3. If the user spelled the word correctly, speak "correct"
if(spell_2.equalsIgnoreCase("Hello")){
	speak("correct");
}	
else
	speak("incorrect");

speak("Destruction");
String spell_3=JOptionPane.showInputDialog("Spell it");
		// 3. If the user spelled the word correctly, speak "correct"
if(spell_3.equalsIgnoreCase("Destruction")){
	speak("correct");
}	
else
	speak("incorrect");
	// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


