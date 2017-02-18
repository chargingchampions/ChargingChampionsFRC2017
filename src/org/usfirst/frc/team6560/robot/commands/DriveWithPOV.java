package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Simpler tank drive for robot with POV controls
 */
public class DriveWithPOV extends Command {

    public DriveWithPOV() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.driveWithPOV(Robot.oi.getPOV());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Robot.oi.getLeftYAxis() != 0 || Robot.oi.getRightYAxis() != 0);
    }

    // Called once after isFinished returns true
    protected void end() {
    	new DriveWithJoysticks();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
