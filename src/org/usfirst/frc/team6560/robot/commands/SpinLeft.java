package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Spins the Robot counterclockwise at an input speed
 */
public class SpinLeft extends Command {
	
	private double speed;
	
	/**
	 * @param speedValue Speed to turn at
	 */
    public SpinLeft(double speedValue) {
        requires(Robot.drive);
        speed = speedValue;
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
