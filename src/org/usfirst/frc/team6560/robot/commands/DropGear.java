package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.Robot;

/**
 * Pulls pistons in Gear Mission to deploy gears
 * Pushes pistons back to close Gear Mission when stopped
 */
public class DropGear extends Command {
	
	boolean complete = false;
	boolean opening;
	
    public DropGear(boolean isOpening) {
    	requires(Robot.gearMission);
    	opening = isOpening;
    	complete = false;
    }

    protected void initialize() {
    	complete = false;
    }

    protected void execute() {
    	if(!complete) {
    		if(opening) {
    			Robot.gearMission.openFlaps();
    			complete = true;
    		}
    		else {
    			Robot.gearMission.closeFlaps();
    			complete = true;
    		}
    	}
    }

    protected boolean isFinished() {
    	return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
