package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Tank Drive robot with two joystick axes
 */
public class DriveWithJoysticks extends Command {

    public DriveWithJoysticks() {
        requires(Robot.drive);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drive.driveWithJoysticks(-0.4 * Robot.oi.getLeftYAxis(), -0.4 * Robot.oi.getRightYAxis());
    }

    protected boolean isFinished() {
        return Robot.oi.getPOV() != -1;
    }

    protected void end() {
    	new DriveWithPOV();
    }

    protected void interrupted() {
    }
}
