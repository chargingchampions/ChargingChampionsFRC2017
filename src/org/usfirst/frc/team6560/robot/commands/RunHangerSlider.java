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
    	//Scales the -1.0 to 1.0 range outputted by the Slider to a range of 0 to 1.0 to avoid hanger from spinning backwards
    	Robot.hanger.runHangerSlider(((Robot.oi.getDSSlider() - 1.0) / 2.0));
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
