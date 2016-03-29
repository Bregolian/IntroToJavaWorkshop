package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot Johnny5 = new Robot();
	Robot Max =new Robot();
	Max.setSpeed(10);

	void go() {
Johnny5.setSpeed(10);
Johnny5.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
		Johnny5.setRandomPenColor();
	drawSquare();
	Johnny5.turn(90);
}
	}

	
	void drawSquare() {
		Johnny5.penDown();
		for (int i = 0; i < 4; i++){
			Johnny5.move(100);
		Johnny5.turn(90);
		

		}
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
