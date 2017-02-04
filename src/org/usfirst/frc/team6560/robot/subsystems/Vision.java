package org.usfirst.frc.team6560.robot.subsystems;

//import edu.wpi.first.wpilibj.vision.*;
import edu.wpi.first.wpilibj.command.*;
import org.usfirst.frc.team6560.robot.RobotMap;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Servo;

public class Vision extends Subsystem{
	CameraServer cam0 = CameraServer.getInstance();
	Servo xServo = new Servo(RobotMap.Pwm.X_AXIS_CAM);
	Servo yServo = new Servo(RobotMap.Pwm.Y_AXIS_CAM);
	
	public void getCameraFeed() {	
	}
	
	public void control360(double x, double y) {
		xServo.set((x + 1) * 0.5);
		yServo.set((y + 1) * 0.5);
	}
	
	public void initDefaultCommand() {
		
	}
}
