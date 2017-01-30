package org.usfirst.frc.team6560.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static class Joysticks {
		public static final int JOYSTICK1 = 5;
		public static final int JOYSTICK2 = 1;
		public static final int DRV_STATION = 0;
	}
	public static class Can {
		//Drive Motors
		public static final int LEFT_FWD_MOTOR = 1;
		public static final int LEFT_REAR_MOTOR = 2;
		public static final int RIGHT_FWD_MOTOR = 14;
		public static final int RIGHT_REAR_MOTOR = 13;
		
		//Pneumatics
		public static final int SOLENOID_0 = 0;
		public static final int SOLENOID_1 = 1;
		public static final int SOLENOID_2 = 2;
		public static final int SOLENOID_3 = 3;
		public static final int SOLENOID_4 = 4;
		public static final int SOLENOID_5 = 5;
		public static final int SOLENOID_6 = 6;
		public static final int SOLENOID_7 = 7;
		public static final int COMPRESSOR = 0;
	}
	
	public static class Pwm {
		//Servos for camera 360
		public static final int X_AXIS_CAM = 8;
		public static final int Y_AXIS_CAM = 9;
		public static final int GEAR_SERVO = 0;
	}
	
}
