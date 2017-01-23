package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoysticks extends Command {

    public DriveWithJoysticks() {
        requires(Robot.drive);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drive.driveWithJoysticks(Robot.oi.gamepad);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drive.stop();
    }

    protected void interrupted() {
    }
}
