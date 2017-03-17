package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Drive straight
 */
public class DriveStraight extends Command {
	double speed;
	
	public DriveStraight(double dbl) {
        requires(Robot.drive);
        speed = dbl;
    }

    protected void initialize() {
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
