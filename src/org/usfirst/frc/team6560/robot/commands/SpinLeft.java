package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Spins the Robot counterclockwise
 */
public class SpinLeft extends Command {

    public SpinLeft() {
        requires(Robot.drive);
    }

    protected void initialize() {
    }
    
    protected void execute() {
    	Robot.drive.spinLeft();
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
