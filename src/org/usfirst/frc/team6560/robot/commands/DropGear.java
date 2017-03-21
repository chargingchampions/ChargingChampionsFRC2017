package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.Robot;

/**
 * Pulls pistons in Gear Mission to deploy gears
 * Pushes pistons back to close Gear Mission when stopped
 */
public class DropGear extends Command {
	
    public DropGear() {
    	requires(Robot.gearMission);
    }
    
    protected void initialize() {
    }

    protected void execute() {
    	Robot.gearMission.openFlaps();
    }

    protected boolean isFinished() {
    	return false;
    }

    protected void end() {
    	Robot.gearMission.closeFlaps();
    }

    protected void interrupted() {
    	end();
    }
}