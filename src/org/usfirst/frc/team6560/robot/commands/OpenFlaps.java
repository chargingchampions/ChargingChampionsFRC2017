package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Opens flaps on gear subsystem
 * 
 * Utilizes a 0.1 second timer in order to return true for the isFinished() method
 * TODO: Implement a better way to do this
 */
public class OpenFlaps extends Command {

	private Timer timer;
	
    public OpenFlaps() {
    	requires(Robot.gearMission);
    }

    protected void initialize() {
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	Robot.gearMission.openFlaps();
    }

    protected boolean isFinished() {
    	return (timer.get() >= 0.1);
    }

    protected void end() {
    	Robot.gearMission.openFlaps();
    	
    }

    protected void interrupted() {
    	end();
    }
}
