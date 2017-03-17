package org.usfirst.frc.team6560.robot;

//import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team6560.robot.commands.*;
import org.usfirst.frc.team6560.robot.RobotMap.Joysticks;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public final Joystick gamepad;
	public final Joystick driverstation;

	public OI() {
		gamepad = new Joystick(Joysticks.JOYSTICK1);
		driverstation = new Joystick(Joysticks.DRV_STATION);

		JoystickButton aButton = new JoystickButton(gamepad, Joysticks.A_BUTTON);
		JoystickButton bButton = new JoystickButton(gamepad, Joysticks.B_BUTTON);
		JoystickButton xButton = new JoystickButton(gamepad, Joysticks.X_BUTTON);
		JoystickButton yButton = new JoystickButton(gamepad, Joysticks.Y_BUTTON);
		JoystickButton leftIndex = new JoystickButton(gamepad, Joysticks.LEFT_INDEX_BUTTON);
//		JoystickButton rightIndex = new JoystickButton(gamepad, Joysticks.RIGHT_INDEX_BUTTON);
//		JoystickButton backButton = new JoystickButton(gamepad, Joysticks.BACK_BUTTON);
//		JoystickButton startButton = new JoystickButton(gamepad, Joysticks.START_BUTTON);
//		JoystickButton leftAxisButton = new JoystickButton(gamepad, Joysticks.LEFT_AXIS_BUTTON);
//		JoystickButton rightAxisButton = new JoystickButton(gamepad, Joysticks.RIGHT_AXIS_BUTTON);

		JoystickButton trigger = new JoystickButton(driverstation, Joysticks.TRIGGER_BUTTON);
		JoystickButton rightThumb = new JoystickButton(driverstation, Joysticks.RIGHT_THUMB_BUTTON);
		JoystickButton button3 = new JoystickButton(driverstation, Joysticks.BUTTON_3);
//		JoystickButton button4 = new JoystickButton(driverstation, Joysticks.BUTTON_4);
//		JoystickButton button5 = new JoystickButton(driverstation, Joysticks.BUTTON_5);
//		JoystickButton button6 = new JoystickButton(driverstation, Joysticks.BUTTON_6);
//		JoystickButton button7 = new JoystickButton(driverstation, Joysticks.BUTTON_7);
//		JoystickButton button8 = new JoystickButton(driverstation, Joysticks.BUTTON_8);
//		JoystickButton button9 = new JoystickButton(driverstation, Joysticks.BUTTON_9);
//		JoystickButton button10 = new JoystickButton(driverstation, Joysticks.BUTTON_10);
//		JoystickButton button11 = new JoystickButton(driverstation, Joysticks.BUTTON_11);
		JoystickButton button12 = new JoystickButton(driverstation, Joysticks.BUTTON_12);

		//Commands
		trigger.whenPressed(new DropGear(true));
		trigger.whenReleased(new DropGear(false));
		rightThumb.whenPressed(new CollectGear(true));
		rightThumb.whenReleased(new CollectGear(false));
		button3.whileHeld(new RunHangerSlider());
		yButton.whileHeld(new DriveStraight(0.7));
		aButton.whileHeld(new DriveStraightBackwards(-0.7));
		xButton.whileHeld(new SpinLeft(0.6));
		bButton.whileHeld(new SpinRight(0.6));
		button12.whileHeld(new SpinHangBackwards());
	}

	// Axes
	public double getLeftXAxis() {
		return gamepad.getRawAxis(Joysticks.LEFT_X_AXIS);
	}

	public double getLeftYAxis() {
		return gamepad.getRawAxis(Joysticks.LEFT_Y_AXIS);
	}

	public double getLeftTrigger() {
		return gamepad.getRawAxis(Joysticks.LEFT_TRIGGER);
	}

	public double getRightTrigger() {
		return gamepad.getRawAxis(Joysticks.RIGHT_TRIGGER);
	}

	public double getRightXAxis() {
		return gamepad.getRawAxis(Joysticks.RIGHT_X_AXIS);
	}

	public double getRightYAxis() {
		return gamepad.getRawAxis(Joysticks.RIGHT_Y_AXIS);
	}

	public int getPOV() {
		return gamepad.getPOV();
	}

	public double getDSXAxis() {
		return driverstation.getRawAxis(Joysticks.DS_X_AXIS);
	}

	public double getDSYAxis() {
		return driverstation.getRawAxis(Joysticks.DS_Y_AXIS);
	}

	public double getDSZAxis() {
		return driverstation.getRawAxis(Joysticks.DS_Z_AXIS);
	}

	public double getDSSlider() {
		return driverstation.getRawAxis(Joysticks.DS_SLIDER);
	}
}
