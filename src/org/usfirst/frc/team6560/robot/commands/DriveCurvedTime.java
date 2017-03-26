package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCurvedTime extends Command {

	private double speed;
	private int angle;
	private double time;
	private Timer timer;
	
    public DriveCurvedTime(double s, int a, double t) {
        requires(Robot.drive);
        speed = s;
        angle = a;
        time = t;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.gyro.reset();
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	Robot.drive.driveCurve(angle, speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() >= time;
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
