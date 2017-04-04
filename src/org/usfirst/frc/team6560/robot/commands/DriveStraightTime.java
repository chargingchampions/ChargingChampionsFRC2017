package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.Robot;

/**
 * Drives straight for an input time and speed
 */
public class DriveStraightTime extends Command {

	private double time;
	private double speed;
	private Timer timer;
	
    public DriveStraightTime(double t, double s) {
        requires(Robot.drive);
        time = t;
        speed = s;
    }

    protected void initialize() {
        Robot.drive.gyro.reset();
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	Robot.drive.driveStraight(speed);
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
