package org.usfirst.frc.team6560.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive.*;
import org.usfirst.frc.team6560.robot.RobotMap.*;
import org.usfirst.frc.team6560.robot.commands.*;

public class Drive extends Subsystem {
    CANTalon leftTopMotor = new CANTalon(Can.LEFT_FWD_MOTOR);
    CANTalon leftBottomMotor = new CANTalon(Can.LEFT_REAR_MOTOR);
    CANTalon rightTopMotor = new CANTalon(Can.RIGHT_FWD_MOTOR);
    CANTalon rightBottomMotor = new CANTalon(Can.RIGHT_REAR_MOTOR);
    
    RobotDrive drivetrain = new RobotDrive(leftTopMotor, leftBottomMotor, rightTopMotor, rightBottomMotor);

    public void driveWithJoysticks(Joystick joy) {
    	drivetrain.arcadeDrive(joy);
    }
    
    public void stop() {
    	leftTopMotor.set(0);
    	leftBottomMotor.set(0);
    	rightTopMotor.set(0);
    	rightBottomMotor.set(0);
    }
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticks());
    }
}
