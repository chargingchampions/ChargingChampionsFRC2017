package org.usfirst.frc.team6560.robot;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team6560.robot.commands.*;
import org.usfirst.frc.team6560.robot.RobotMap.Joysticks;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Holds everything to be used by the Operator Interface
 */
public class OI {
	public final Joystick gamepad;
	public final Joystick secondaryRemote;

	public OI() {
		gamepad = new Joystick(Joysticks.GAMEPAD);
		secondaryRemote = new Joystick(Joysticks.SECONDARY_CONTROLLER);

		JoystickButton aButton = new JoystickButton(gamepad, Joysticks.A_BUTTON);
		JoystickButton bButton = new JoystickButton(gamepad, Joysticks.B_BUTTON);
		JoystickButton xButton = new JoystickButton(gamepad, Joysticks.X_BUTTON);
		JoystickButton yButton = new JoystickButton(gamepad, Joysticks.Y_BUTTON);
		JoystickButton leftIndex = new JoystickButton(gamepad, Joysticks.LEFT_INDEX_BUTTON);
		JoystickButton rightIndex = new JoystickButton(gamepad, Joysticks.RIGHT_INDEX_BUTTON);
		JoystickButton backButton = new JoystickButton(gamepad, Joysticks.BACK_BUTTON);
		JoystickButton startButton = new JoystickButton(gamepad, Joysticks.START_BUTTON);
		JoystickButton leftAxisButton = new JoystickButton(gamepad, Joysticks.LEFT_AXIS_BUTTON);
		JoystickButton rightAxisButton = new JoystickButton(gamepad, Joysticks.RIGHT_AXIS_BUTTON);

		JoystickButton trigger = new JoystickButton(secondaryRemote, Joysticks.TRIGGER_BUTTON);
		JoystickButton rightThumb = new JoystickButton(secondaryRemote, Joysticks.RIGHT_THUMB_BUTTON);
		JoystickButton button3 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_3);
		JoystickButton button4 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_4);
		JoystickButton button5 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_5);
		JoystickButton button6 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_6);
		JoystickButton button7 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_7);
		JoystickButton button8 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_8);
		JoystickButton button9 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_9);
		JoystickButton button10 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_10);
		JoystickButton button11 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_11);
		JoystickButton button12 = new JoystickButton(secondaryRemote, Joysticks.BUTTON_12);

		//Gamepad Commands
		
		//Secondary Commands

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

	public double getSecondaryXAxis() {
		return secondaryRemote.getRawAxis(Joysticks.SECOND_X_AXIS);
	}

	public double getSecondaryYAxis() {
		return secondaryRemote.getRawAxis(Joysticks.SECOND_Y_AXIS);
	}

	public double getSecondaryZAxis() {
		return secondaryRemote.getRawAxis(Joysticks.SECOND_Z_AXIS);
	}

	public double getSecondarySlider() {
		return secondaryRemote.getRawAxis(Joysticks.SECOND_SLIDER);
	}
}
