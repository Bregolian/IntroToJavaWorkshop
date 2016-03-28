package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot Johnny5=new Robot ();
	Johnny5.moveTo(750,750);
	Johnny5.penDown();
Johnny5.setSpeed(10);
for (int i = 0; i < 75; i++) {
	


	Johnny5.setRandomPenColor();
	Johnny5.move(5*i);
	Johnny5.turn(360/7);
			
			// 9. Set the pen width to i
	Johnny5.setPenWidth(i);
}

	}
}
