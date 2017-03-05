package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpinHangBackwards extends Command {

    public SpinHangBackwards() {
        requires(Robot.hanger);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.hanger.runHangerBackwards();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.hanger.stopHanger();
    }

    protected void interrupted() {
    	end();
    }
}
