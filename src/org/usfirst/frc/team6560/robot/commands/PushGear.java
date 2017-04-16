package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Pushes gear out/retracts using pneumatic piston
 */
public class PushGear extends Command {
	boolean complete;
	boolean isPushing;
	
    public PushGear(boolean isPushing) {
    	requires(Robot.gearMission);
    	this.isPushing = isPushing;
    }

    protected void initialize() {
    	complete = false;
    }

    protected void execute() {
    	if(!complete) {
    		if(isPushing) {
    			Robot.gearMission.pushGear();
    			complete = true;
    		}
    		else {
    			Robot.gearMission.retract();
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
