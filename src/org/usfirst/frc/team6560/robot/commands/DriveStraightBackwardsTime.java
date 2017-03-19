package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Drives straight backwards for a given time
 */
public class DriveStraightBackwardsTime extends Command {

	double time;
	double speed;
	Timer timer;
	
    public DriveStraightBackwardsTime(double t, double s) {
        requires(Robot.drive);
        time = t;
        speed = s;
    }

    protected void initialize() {
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	Robot.drive.drivetrain.tankDrive(-1 * speed, -1 * speed);
    }

    protected boolean isFinished() {
    	return (timer.get() >= time);
    }

    protected void end() {
    	Robot.drive.stop();
    	timer.stop();
    }

    protected void interrupted() {
    	end();
    }
}
