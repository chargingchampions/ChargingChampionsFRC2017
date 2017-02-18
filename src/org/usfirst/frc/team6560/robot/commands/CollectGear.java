package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.Robot;

/**
 * Sets the servo on the Gear Mission to tilt in order to collect gear
 * Returns to default position when stopped
 */
public class CollectGear extends Command {
	
	boolean turning;
	boolean complete = false;

    public CollectGear(boolean isTurning) {
        requires(Robot.gearMission);
        turning = isTurning;
        complete = false;
    }
    
    protected void initialize() {
    	complete = false;
    }

    protected void execute() {
    	if(!complete) {
    		if(turning) {
    			Robot.gearMission.collectGear();
    			complete = true;
    		}
    		else {
    			Robot.gearMission.resetServo();
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
