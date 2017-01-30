package org.usfirst.frc.team6560.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team6560.robot.RobotMap;
import org.usfirst.frc.team6560.robot.commands.*;

public class GearMission extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Solenoid solenoid_4 = new Solenoid(RobotMap.Can.SOLENOID_4);
	Solenoid solenoid_5 = new Solenoid(RobotMap.Can.SOLENOID_5);
	Solenoid solenoid_6 = new Solenoid(RobotMap.Can.SOLENOID_6);
	Solenoid solenoid_7 = new Solenoid(RobotMap.Can.SOLENOID_7);
	Compressor compressor_0 = new Compressor(RobotMap.Can.COMPRESSOR);
	Servo rampServo = new Servo(RobotMap.Pwm.GEAR_SERVO);

    public void initDefaultCommand() {
        setDefaultCommand(new DropGears());
    }
    
    public void dropGears(boolean bool) {
    	compressor_0.start();
    	solenoid_5.set(bool);
    	solenoid_6.set(bool);
    }
    
    public void collectGear(boolean bool) {
    	//TODO: Find values for the correct angles
    	if(bool)
    		rampServo.set(0);
    	else
    		rampServo.set(0);
    }
}

 