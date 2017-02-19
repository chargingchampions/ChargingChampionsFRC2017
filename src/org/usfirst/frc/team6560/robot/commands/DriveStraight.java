package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Drive straight with the gyro
 */
public class DriveStraight extends Command {

    public DriveStraight() {
        requires(Robot.drive);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drive.driveStraight();
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
