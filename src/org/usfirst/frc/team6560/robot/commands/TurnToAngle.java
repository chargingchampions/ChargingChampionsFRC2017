package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnToAngle extends Command {

	int angle;
	
    public TurnToAngle(int n) {
        requires(Robot.drive);
        angle = n;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.gyro.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(angle > 0 && angle < 180)
    		Robot.drive.spinRight(0.3);
    	if(angle > 180 && angle < 361)
    		Robot.drive.spinLeft(0.3);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(angle > 0 && angle < 180)
        	return (int)Robot.drive.gyro.getAngle() >= angle;
        else
        	return (int)Robot.drive.gyro.getAngle() <= angle;	
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
