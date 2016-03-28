package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Johnny5=new Robot();
Robot Max=new Robot();
Max.moveTo(400,100);
Johnny5.moveTo(500,100);
	for (int i = 0; i < 8; i++) {
	Johnny5.penDown();
Johnny5.turn(360/8);
	Johnny5.move(50);
		
	}
	Max.penDown();
	for (int i = 0; i<3; i++){
	Max.turn(120);
	Max.move(50);
	}
	}
}