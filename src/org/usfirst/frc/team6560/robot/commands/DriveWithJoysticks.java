package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import org.usfirst.frc.team6560.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Tank Drive robot with two joystick axes as input
 */
public class DriveWithJoysticks extends Command {

    public DriveWithJoysticks() {
        requires(Robot.drive);
    }

    protected void initialize() {
    }

    protected void execute() {
    	//Drives Robot in Reverse (idk if needed)
    	//if(Robot.oi.gamepad.getRawButton(RobotMap.Joysticks.LEFT_INDEX_BUTTON))
    	//	Robot.drive.driveWithJoysticks(0.9 * Robot.oi.getRightYAxis(), 0.9 * Robot.oi.getLeftYAxis());
    	//Drivetrain is inverted so negative values are needed
    	Robot.drive.driveWithJoysticks(-0.9 * Robot.oi.getLeftYAxis(), -0.9 * Robot.oi.getRightYAxis());
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
