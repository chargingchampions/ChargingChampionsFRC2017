package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Stops all drive for a given time
 */
public class StopDriveTime extends Command {
	
	double time;
	Timer timer;

    public StopDriveTime(double t) {
        requires(Robot.drive);
        time = t;
        
    }

    protected void initialize() {
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	Robot.drive.stop();
    }

    protected boolean isFinished() {
        return timer.get() >= time;
    }

    protected void end() {
    	timer.stop();
    }

    protected void interrupted() {
    	end();
    }
}
