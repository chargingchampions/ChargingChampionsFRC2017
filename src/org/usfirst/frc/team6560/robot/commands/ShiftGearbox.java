package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.*;

/**
 * Manipulates gearbox to shift gears to a higher speed.
 */
public class ShiftGearbox extends Command {
	
	boolean complete = false;
	boolean shifting;

    public ShiftGearbox(boolean isShifting) {
    	requires(Robot.gearMission);
    	shifting = isShifting;
    	complete = false;
    }

    protected void initialize() {
    	complete = false;
    }

    protected void execute() {
    	if(!complete) {
    		if(shifting) {
    			Robot.gearMission.shiftGearsHigh();
    			complete = true;
    		}
    		else {
    			Robot.gearMission.shiftGearsLow();
    			complete = true;
    		}
    	}
    }

    protected boolean isFinished() {
        return complete;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
