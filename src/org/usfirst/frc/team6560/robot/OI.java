package org.usfirst.frc.team6560.robot;

//import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team6560.robot.commands.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public final Joystick gamepad;
	public final Joystick driverstation;
	
	public OI() {
		gamepad = new Joystick(RobotMap.Joysticks.JOYSTICK1);
		driverstation = new Joystick(RobotMap.Joysticks.DRV_STATION);
		
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
		
		JoystickButton trigger = new JoystickButton(driverstation, 1);
		JoystickButton rightThumb = new JoystickButton(driverstation, 2);
		JoystickButton button3 = new JoystickButton(driverstation, 3);
		JoystickButton button4 = new JoystickButton(driverstation, 4);
		
		//Commands
		trigger.whenPressed(new DropGear(true));
		rightThumb.whenPressed(new DropGear(false));
		leftIndex.whenPressed(new ShiftGearbox(true));
		rightIndex.whenPressed(new ShiftGearbox(false));
		button3.whenPressed(new CollectGear(true));
		button3.whenReleased(new CollectGear(false));
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
	
	public int getPOV() {
		return gamepad.getPOV();
	}
	
	public double getDSXAxis() {
		return driverstation.getRawAxis(0);
	}
	
	public double getDSYAxis() {
		return driverstation.getRawAxis(1);
	}
	
	public double getDSZAxis() {
		return driverstation.getRawAxis(2);
	}
	
	public double getDSSlider() {
		return driverstation.getRawAxis(3);
	}
}

