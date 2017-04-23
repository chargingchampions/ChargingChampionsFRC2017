package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Drive straight backwards with an input speed
 */
public class DriveStraightBackwards extends Command {
	private double speed;

    public DriveStraightBackwards(double speedValue) {
        requires(Robot.drive);
        speed = speedValue;
    }

    protected void initialize() {
    	Robot.drive.gyro.reset();
    }

    protected void execute() {
    	Robot.drive.driveStraightBackwards(speed);
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
