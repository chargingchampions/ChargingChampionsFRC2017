package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Turns robot left/right until the gyro reads a given angle
 */
public class TurnToAngle extends Command {
	private int angle;

	public TurnToAngle(int n) {
		requires(Robot.drive);
		angle = n;
	}

	protected void initialize() {
		Robot.drive.gyro.reset();
	}

	protected void execute() {
		if (angle > 0)
			Robot.drive.spinRight(0.25);
		if (angle < 0)
			Robot.drive.spinLeft(0.25);
	}

	protected boolean isFinished() {
		if (angle > 0)
			return Robot.drive.getGyroAngle() >= angle;
		else
			return Robot.drive.getGyroAngle() <= angle;
	}

	protected void end() {
		Robot.drive.stop();
	}

	protected void interrupted() {
		end();
	}
}