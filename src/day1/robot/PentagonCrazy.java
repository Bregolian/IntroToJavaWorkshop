package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
Robot Johnny5 =new Robot ();
Johnny5.moveTo(750,350);Johnny5.penDown();
Johnny5.setSpeed(10);
Johnny5.setRandomPenColor();
int sides=10;
		
int angle=360/sides;
		
for (int i = 0; i < 500; i++) {
	

Johnny5.move(i);
Johnny5.turn(angle);
Johnny5.turn(1);
}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}