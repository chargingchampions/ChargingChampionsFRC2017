package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.Robot;

/**
 * Sets the servo on the Gear Mission to tilt in order to collect gear
 * Returns to default position when stopped
 */
public class CollectGear extends Command {

    public CollectGear() {
        requires(Robot.gearMission);
    }
    protected void initialize() {
    }

    protected void execute() {
    	Robot.gearMission.collectGear();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.gearMission.gearServo.set(0);
    }

    protected void interrupted() {
    }
}
