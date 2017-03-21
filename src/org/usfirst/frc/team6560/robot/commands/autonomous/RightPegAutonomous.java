package org.usfirst.frc.team6560.robot.commands.autonomous;

import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Drives straight to the baseline. Lift dropping will be implemented
 */
public class RightPegAutonomous extends CommandGroup {

    public RightPegAutonomous() {
    	 //TODO: Add autonomous for the right peg, using turn and drive straight commands
    	addSequential(new DriveStraightTime(3.5, 0.4));
    }
}
