package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Spins the Robot counterclockwise at an input speed
 */
public class SpinLeft extends Command {
	
	private double speed;
	
    public SpinLeft(double dbl) {
        requires(Robot.drive);
        speed = dbl;
    }

    protected void initialize() {
    }
    
    protected void execute() {
    	Robot.drive.spinLeft(speed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drive.stop();
    }

    protected void interrupted() {
    	end();
    }
}
