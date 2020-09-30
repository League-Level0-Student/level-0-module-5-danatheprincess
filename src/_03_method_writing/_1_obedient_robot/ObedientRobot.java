package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot num =new Robot();	
	
public static void main(String[] args) {
	num.setSpeed(100);
drawSquare();
drawTringle();	
drawCircle();	
	
	
	
	
	
	
	
	
	
	
}

private static void drawSquare() {
	// TODO Auto-generated method stub
	num.penDown();
	for(int s =0;s<4;s++) {
	num.move(200);
	num.turn(90);
	}
	
}
private static void drawTringle() {
	for(int t=0;t<3;t++) {
		num.move(100);
		num.turn(120);
	}
	}
private static void drawCircle() {
	for(int c=0;c<360;c++) {
	num.move(1);
	num.turn(1);
	}
}
}
