package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoysticksGyro extends Command {

    public DriveWithJoysticksGyro() {
        requires(Robot.drive);
    }

    protected void initialize() {
    	Robot.drive.gyro.reset();
    }

    protected void execute() {
    	if(Math.abs(Robot.oi.getLeftYAxis() - Robot.oi.getRightYAxis()) <= 0.08) {
    		if(Robot.oi.getLeftYAxis() < 0)
    			Robot.drive.driveStraight(Robot.oi.getLeftYAxis());
    		else if(Robot.oi.getLeftYAxis() > 0)
    			Robot.drive.driveStraightBackwards(Robot.oi.getLeftYAxis());
    	}
    	else
    		Robot.drive.driveWithJoysticks(Robot.oi.getLeftYAxis(), Robot.oi.getRightYAxis());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drive.stop();
    }

    protected void interrupted() {
    	end();
    }
}
