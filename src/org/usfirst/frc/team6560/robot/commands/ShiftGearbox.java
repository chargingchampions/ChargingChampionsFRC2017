package org.usfirst.frc.team6560.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6560.robot.*;

/**
 * Manipulates gearbox to shift gears to a higher speed.
 * Returns to original speed when stopped
 */
public class ShiftGearbox extends Command {

    public ShiftGearbox() {
    	requires(Robot.gearMission);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.gearMission.shiftGears();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.gearMission.solenoid_1.set(false);
    	Robot.gearMission.solenoid_2.set(false);
    }

    protected void interrupted() {
    }
}
