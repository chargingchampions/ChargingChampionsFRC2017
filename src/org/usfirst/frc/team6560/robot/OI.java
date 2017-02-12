package org.usfirst.frc.team6560.robot;

//import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team6560.robot.commands.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public final Joystick gamepad;
	
	public OI() {
		gamepad = new Joystick(RobotMap.Joysticks.JOYSTICK1);
		
		JoystickButton aButton = new JoystickButton(gamepad, 1);
		JoystickButton bButton = new JoystickButton(gamepad, 2);
		JoystickButton xButton = new JoystickButton(gamepad, 3);
		JoystickButton yButton = new JoystickButton(gamepad, 4);
		JoystickButton leftIndex = new JoystickButton(gamepad, 5);
		JoystickButton rightIndex = new JoystickButton(gamepad, 6);
		JoystickButton backButton = new JoystickButton(gamepad, 7);
		JoystickButton startButton = new JoystickButton(gamepad, 8);
		JoystickButton leftJoyButton = new JoystickButton(gamepad, 9);
		JoystickButton rightJoyButton = new JoystickButton(gamepad, 10);
		
		//Commands
		aButton.whenPressed(new DropGear());
		leftIndex.whenPressed(new ShiftGearbox(true));
		rightIndex.whenPressed(new ShiftGearbox(false));
	}

	//Axes
	public double getLeftXAxis() {
		return gamepad.getRawAxis(0);
	}
	public double getLeftYAxis() {
		return gamepad.getRawAxis(1);
	}	
	public double getLeftTrigger() {
		return gamepad.getRawAxis(2);
	}
	public double getRightTrigger() {
		return gamepad.getRawAxis(3);
	}
	public double getRightXAxis() {
		return gamepad.getRawAxis(4);
	}
	public double getRightYAxis() {
		return gamepad.getRawAxis(5);
	}
}

