package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Manipulates flaps on gear subsystem
 */
public class MoveFlaps extends Command {
	boolean complete;
	boolean isOpening;
	
	/**
	 * @param isOpening True: Open Flaps / False: Close Flaps
	 */
    public MoveFlaps(boolean isOpening) {
    	requires(Robot.gearMission);
    	this.isOpening = isOpening;
    }

    protected void initialize() {
    	complete = false;
    }

    protected void execute() {
    	if(!complete) {
    		if(isOpening) {
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
    	return complete;
    }

    protected void end() {
    }

    protected void interrupted() {
    	end();
    }
}
