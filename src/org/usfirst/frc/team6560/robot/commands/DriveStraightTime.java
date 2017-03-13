package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.Robot;

/**
 *
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

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.drivetrain.drive(speed, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (timer.get() >= time);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.stop();
    	timer.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
