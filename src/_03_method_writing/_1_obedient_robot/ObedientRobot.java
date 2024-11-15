package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	static Robot rob = new Robot();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rob.setSpeed(100);
		rob.penDown();
		drawCircle();
	}
	private static void drawCircle() {
		for(int i=0; i<36; i++) {
		rob.move(50);
		rob.turn(10);
		}
	}
	static  void drawSquare() {
		for(int i=0; i<4; i++) {
			rob.move(200);
			rob.turn(90);
		}
	}
	static void drawTriangle() {
		for(int i=0; i<3; i++) {

			rob.move(500);
			rob.turn(120);
		}
	}
}

