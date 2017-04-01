package org.usfirst.frc.team6560.robot.commands;

import org.usfirst.frc.team6560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Pushes gear out using pneumatic piston
 */
public class PushGear extends Command {

	private double time;
	private Timer timer;
	
    public PushGear(double t) {
    	requires(Robot.gearMission);
    	time = t;
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
    	return timer.get() >= time;
    }

    protected void end() {
    	Robot.gearMission.retract();
    }

    protected void interrupted() {
    	end();
    }
}
