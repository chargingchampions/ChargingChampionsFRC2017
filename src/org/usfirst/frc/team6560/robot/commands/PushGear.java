package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Pushes gear out using pneumatic piston
 */
public class PushGear extends Command {

	private Timer timer;
	
    public PushGear() {
    	requires(Robot.gearMission);
    }

    protected void initialize() {
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	Robot.gearMission.pushGear();
    }

    protected boolean isFinished() {
        return timer.get() >= 2;
    }

    protected void end() {
    	Robot.gearMission.retract();
    }

    protected void interrupted() {
    	end();
    }
}
