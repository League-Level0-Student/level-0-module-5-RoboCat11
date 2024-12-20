package _03_method_writing._1_obedient_robot;

import java.awt.Component;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	static Robot rob = new Robot();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rob.setSpeed(100);
		rob.penDown();
			for(int i=0; i<1; i++) {
			String input = JOptionPane.showInputDialog("What shape do you want?");
			String color = JOptionPane
					.showInputDialog("What color do you want? You can either pick red, green, or blue.");
		
			if (color.contains("red")) {
				rob.setPenColor(255, 0, 0);
			}
			if (color.contains("green")) {
				rob.setPenColor(0, 255, 0);
			}
			if (color.contains("blue")) {
				rob.setPenColor(0, 0, 255);
			}
			if (input.contains("square")) {
				drawSquare();
			}
			if (input.contains("triangle")) {
				drawTriangle();
			}
			if (input.contains("circle")) {
				drawCircle();
				}
			}
		}



	private static void drawCircle() {
		for(int i=0; i<36; i++) {
		rob.move(50);
		rob.turn(10);
		}
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(200);
			rob.turn(90);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {

			rob.move(500);
			rob.turn(120);
		}
	}
}
