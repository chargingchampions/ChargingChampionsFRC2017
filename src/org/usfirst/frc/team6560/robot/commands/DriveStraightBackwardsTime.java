package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Drives straight backwards for a given time and speed
 */
public class DriveStraightBackwardsTime extends Command {

	private double time;
	private double speed;
	private Timer timer;
	
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
    	Robot.drive.driveStraightBackwards(speed);
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
