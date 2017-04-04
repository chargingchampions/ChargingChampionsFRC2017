package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.Robot;

/**
 * Manipulates the servo on the gear subsystem to tilt/untilt to collect and secure gear
 */
public class CollectGear extends Command {

    public CollectGear() {
        requires(Robot.gearMission);
    }
    
    protected void initialize() {
    }

    protected void execute() {
    	Robot.gearMission.resetServo();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.gearMission.collectGear();
    }

    protected void interrupted() {
    	end();
    }
}