package day1.robot;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
public class Robot_Dojo {
public static void main(String[] args) {
	Robot Johnny5=new Robot();
	Johnny5.setSpeed(5);
	Johnny5.penUp();
	Johnny5.moveTo(700,350);
	Johnny5.penDown();
	Johnny5.setPenColor(Color.BLACK);
	Johnny5.turn(270);
	Johnny5.move(300);
	Johnny5.turn(153);
	Johnny5.move(335);
	Johnny5.turn(27);
	Johnny5.move(400);
	Johnny5.turn(27);
	Johnny5.move(335);
	Johnny5.turn(153);
	Johnny5.move(1000);
}
}
