package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Closes flaps on gear collection system
 * 
 * Utilizes a 0.1 second timer in order to return true for the isFinished() method
 * TODO: Implement a better way to do this
 */
public class CloseFlaps extends Command {
	private Timer timer;

    public CloseFlaps() {
    	requires(Robot.gearMission);
    }

    protected void initialize() {
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	Robot.gearMission.closeFlaps();
    }

    protected boolean isFinished() {
        return timer.get() >= 0.1;
    }

    protected void end() {
    	Robot.gearMission.closeFlaps();
    }

    protected void interrupted() {
    	end();
    }
}
