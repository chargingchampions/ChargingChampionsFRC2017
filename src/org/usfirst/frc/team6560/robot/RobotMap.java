package org.usfirst.frc.team6560.robot;

/**
 * Holds all important constants
 */
public class RobotMap {
	public static class Joysticks {
		public static final int JOYSTICK1 = 5;
		public static final int DRV_STATION = 0;
		
		//Joystick buttons
		public static final int A_BUTTON = 1;
		public static final int B_BUTTON = 2;
		public static final int X_BUTTON = 3;
		public static final int Y_BUTTON = 4;
		public static final int LEFT_INDEX_BUTTON = 5;
		public static final int RIGHT_INDEX_BUTTON = 6;
		public static final int BACK_BUTTON = 7;
		public static final int START_BUTTON = 8;
		public static final int LEFT_AXIS_BUTTON = 9;
		public static final int RIGHT_AXIS_BUTTON = 10;
		
		//Joystick axes
		public static final int LEFT_X_AXIS = 0;
		public static final int LEFT_Y_AXIS = 1;
		public static final int LEFT_TRIGGER = 2;
		public static final int RIGHT_TRIGGER = 3;
		public static final int RIGHT_X_AXIS = 4;
		public static final int RIGHT_Y_AXIS = 5;
		
		//DS Buttons
		public static final int TRIGGER_BUTTON = 1;
		public static final int RIGHT_THUMB_BUTTON = 2;
		public static final int BUTTON_3 = 3;
		public static final int BUTTON_4 = 4;
		public static final int BUTTON_5 = 5;
		public static final int BUTTON_6 = 6;
		public static final int BUTTON_7 = 7;
		public static final int BUTTON_8 = 8;
		public static final int BUTTON_9 = 9;
		public static final int BUTTON_10 = 10;
		public static final int BUTTON_11 = 11;
		public static final int BUTTON_12 = 12;
		
		//DS Axes
		public static final int DS_X_AXIS = 0;
		public static final int DS_Y_AXIS = 1;
		public static final int DS_Z_AXIS = 2;
		public static final int DS_SLIDER = 3;
	}
	
	public static class Can {
		//Drive Motors
		public static final int LEFT_FWD_MOTOR = 12;
		public static final int LEFT_REAR_MOTOR = 13;
		public static final int RIGHT_FWD_MOTOR = 14;
		public static final int RIGHT_REAR_MOTOR = 15;
		
		//Hanger Motors
		public static final int MOTOR = 61;
		public static final int MOTOR1 = 62;
		
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
	
	public static  class Pwm {
		//Gear Mission
		public static final int GEAR_SERVO = 0;
	}
	
}
