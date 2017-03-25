package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Turns robot left/right until the gyro reads a given angle
 */
public class TurnToAngle extends Command {
	private int angle;
	
    public TurnToAngle(int n) {
        requires(Robot.drive);
        angle = n;
    }

    protected void initialize() {
    	Robot.drive.gyro.reset();
    }

    protected void execute() {
    	if(angle > 0 && angle < 180)
    		Robot.drive.spinRight(0.5);
    	if(angle > 180 && angle < 361)
    		Robot.drive.spinLeft(0.5);
    }

    protected boolean isFinished() {
        if(angle > 0 && angle < 180)
        	return (int)Robot.drive.getGyroAngle() >= angle;
        else
        	return (int)Robot.drive.getGyroAngle() <= angle;	
    }

    protected void end() {
    	Robot.drive.stop();
    }

    protected void interrupted() {
    	end();
    }
}
