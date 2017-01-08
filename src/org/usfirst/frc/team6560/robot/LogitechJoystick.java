package org.usfirst.frc.team6560.robot;

import edu.wpi.first.wpilibj.*;

public class LogitechJoystick extends Joystick{

	private static final int X_AXIS = 0;
	private static final int Y_AXIS = 1;
	private static final int Z_AXIS = 2;
	private static final int SLIDER = 3;
	private static final int TRIGGERED = 1;
	private static final int RIGHT_THUMB = 2;
	private static final int BUTTON_3 = 3;

	//Constructs using Joystick superclass
	public LogitechJoystick(int port) {
		super(port);
	}
	
	//Double values of axes
	public double getXAxis() {
		return getRawAxis(X_AXIS);
	}
	
	public double getYAxis() {
		return getRawAxis(Y_AXIS);
	}
	
	public double getZAxis() {
		return getRawAxis(Z_AXIS);
	}
	
	public double getSlider() {
		return getRawAxis(SLIDER);
	}
	
	//Boolean values of buttons
	public boolean getTriggered() {
		return getRawButton(TRIGGERED);
	}
	
	public boolean getRightThumb() {
		return getRawButton(RIGHT_THUMB);
	}
	
	public boolean getButton3() {
		return getRawButton(BUTTON_3);
	}
}
