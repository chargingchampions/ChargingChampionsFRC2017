package org.usfirst.frc.team6560.robot.commands.autonomous;

import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightPegAutonomous extends CommandGroup {

    public RightPegAutonomous() {
    	addSequential(new DriveStraightTime(3.5, 0.4));
    }
}
