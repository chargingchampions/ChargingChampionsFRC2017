package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Runs the hanger motor at a speed provided by input from Driver Station slider
 */
public class RunHangerSlider extends Command {

    public RunHangerSlider() {
    	requires(Robot.hanger);
    }

    protected void initialize() {
    }

    protected void execute() {
    	//Scales the -1.0 to 1.0 range outputted by the Slider to a range of 0 to 1.0 to avoid hanger from spinning backwards
    	Robot.hanger.runHangerSlider(((Robot.oi.getSecondarySlider() - 1.0) / 2.0));
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
