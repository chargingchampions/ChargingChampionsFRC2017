package org.usfirst.frc.team6560.robot.commands.autonomous;

import org.usfirst.frc.team6560.robot.commands.DriveStraightBackwardsTime;
import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;
import org.usfirst.frc.team6560.robot.commands.DropGear;
import org.usfirst.frc.team6560.robot.commands.StopDriveTime;
import org.usfirst.frc.team6560.robot.commands.TurnToAngle;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Drives straight to the baseline. Lift dropping will be implemented
 */
public class LeftPegAutonomous extends CommandGroup {

    public LeftPegAutonomous() {
        //TODO: Add autonomous for the left peg, using turn and drive straight commands
    	addSequential(new DriveStraightTime(2.0, 0.4));
    	addSequential(new StopDriveTime(0.1));
    	addSequential(new TurnToAngle(60));
    	addSequential(new StopDriveTime(0.1));
    	addSequential(new DriveStraightTime(1.0, 0.4));
    	addSequential(new StopDriveTime(0.4));
    	addSequential(new DropGear());
    	addSequential(new DriveStraightBackwardsTime(0.5, 0.8));
    }
}
