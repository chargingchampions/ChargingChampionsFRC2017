package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Drives straight backwards for an input time and speed
 */
public class DriveStraightBackwardsTime extends Command {

	private double time;
	private double speed;
	private Timer timer;
	
    public DriveStraightBackwardsTime(double timeValue, double speedValue) {
        requires(Robot.drive);
        time = timeValue;
        speed = speedValue;
    }

    protected void initialize() {
        Robot.drive.gyro.reset();
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
