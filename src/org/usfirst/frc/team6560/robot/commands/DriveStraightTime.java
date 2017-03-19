package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.Robot;

/**
 * Drives straight for a given time
 */
public class DriveStraightTime extends Command {

	double time;
	double speed;
	Timer timer;
	
    public DriveStraightTime(double t, double s) {
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
    	Robot.drive.drivetrain.tankDrive(0.975 * speed, speed);
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
