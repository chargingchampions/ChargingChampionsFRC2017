package org.usfirst.frc.team6560.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

import org.usfirst.frc.team6560.robot.RobotMap;
import org.usfirst.frc.team6560.robot.RobotMap.*;
import org.usfirst.frc.team6560.robot.commands.*;

public class GearMission extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Solenoid solenoid_4 = new Solenoid(RobotMap.Can.SOLENOID_4);
	Solenoid solenoid_5 = new Solenoid(RobotMap.Can.SOLENOID_5);
	Solenoid solenoid_6 = new Solenoid(RobotMap.Can.SOLENOID_6);
	Solenoid solenoid_7 = new Solenoid(RobotMap.Can.SOLENOID_7);
	Compressor compressor_0 = new Compressor(0);

    public void initDefaultCommand() {
        setDefaultCommand(new PushGears());
    }
    
    public void pushGears(boolean bool) {
    	compressor_0.start();
    	solenoid_5.set(bool);
    	solenoid_6.set(bool);
    }
}

 