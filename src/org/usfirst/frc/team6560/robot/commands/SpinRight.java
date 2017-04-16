package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Spins the Robot clockwise at an input speed
 */
public class SpinRight extends Command {
	
	private double speed;
	
    public SpinRight(double speedValue) {
        requires(Robot.drive);
        speed = speedValue;
    }

    protected void initialize() {
    }
    
    protected void execute() {
    	Robot.drive.spinRight(speed);
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
