package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Runs the hangar motor according to the values provided by the Driver Station slider
 */
public class RunHangerSlider extends Command {

    public RunHangerSlider() {
    	requires(Robot.hanger);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.hanger.runHangerSlider(Robot.oi.getDSSlider());
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
