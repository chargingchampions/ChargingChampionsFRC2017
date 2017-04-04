package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Drives the robot at a curve until a certain time is reached
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

    protected void initialize() {
    	Robot.drive.gyro.reset();
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	Robot.drive.driveCurve(angle, speed);
    }

    protected boolean isFinished() {
        return timer.get() >= time;
    }

    protected void end() {
    	Robot.drive.stop();
    }

    protected void interrupted() {
    	end();
    }
}
