package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.Robot;

/**
 * Manipulates the servo on the Gear Mission to tilt/untilt to collect and secure gear
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
    			Robot.gearMission.resetServo();
    			complete = true;
    		}
    		else {
    			Robot.gearMission.collectGear();
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
