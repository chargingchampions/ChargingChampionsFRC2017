package org.usfirst.frc.team6560.robot;

import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team6560.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public final Joystick gamepad;
	
	public OI() {
		gamepad = new Joystick(RobotMap.Joysticks.JOYSTICK1);
		
		//Right hand buttons
		//TODO check if buttons are 0 based on driver station
//		JoystickButton trigger = new JoystickButton(gamepad, 1);
//		JoystickButton rightThumb = new JoystickButton(gamepad, 2);
//		JoystickButton button3 = new JoystickButton(gamepad, 3);
//		JoystickButton button4 = new JoystickButton(gamepad, 4);
//		Joystickaew JoystickButton(gamepad, 5);
//		
//		//Left hand buttons
//		JoystickButton button6 = new JoystickButton(gamepad, 6);
//		JoystickButton button7 = new JoystickButton(gamepad, 7);
//		JoystickButton button8 = new JoystickButton(gamepad, 8);
//		JoystickButton button9 = new JoystickButton(gamepad, 9);
//		JoystickButton button10 = new JoystickButton(gamepad, 10);
//		JoystickButton button11 = new JoystickButton(gamepad, 11);
//		JoystickButton button12 = new JoystickButton(gamepad, 12);
//		
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
	}
    
	public double getLeftYAxis() {
		return gamepad.getRawAxis(1);
	}
	
	public double getRightYAxis() {
		return gamepad.getRawAxis(5);
	}
	
	public double getZAxis() {
		return gamepad.getRawAxis(2);
	}
}

