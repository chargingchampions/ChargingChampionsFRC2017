package org.usfirst.frc.team6560.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static class Joysticks {
		public static final int JOYSTICK = 1;
		public static final int DRV_STATION = 0;
	}
	public static class Can {
		//Drive Motors
		public static final int LEFT_FWD_MOTOR = 1;
		public static final int LEFT_REAR_MOTOR = 2;
		public static final int RIGHT_FWD_MOTOR = 14;
		public static final int RIGHT_REAR_MOTOR = 13;
	}
	
	public static class Pwm {
		//Servos for camera 360
		public static final int X_AXIS_CAM = 0;
		public static final int Y_AXIS_CAM = 0;
	}
}
