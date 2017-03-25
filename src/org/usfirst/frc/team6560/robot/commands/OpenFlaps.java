package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OpenFlaps extends Command {

	private Timer timer;
	
    public OpenFlaps() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.gearMission);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gearMission.openFlaps();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (timer.get() >= 0.1);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.gearMission.openFlaps();
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
