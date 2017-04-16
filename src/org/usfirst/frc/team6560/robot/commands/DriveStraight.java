package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Drives straight with an input speed
 */
public class DriveStraight extends Command {
	private double speed;
	
	public DriveStraight(double speedValue) {
        requires(Robot.drive);
        speed = speedValue;
    }

    protected void initialize() {
        Robot.drive.gyro.reset();
    }

    protected void execute() {
    	Robot.drive.driveStraight(speed);
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
