package org.usfirst.frc.team6560.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6560.robot.commands.DriveStraightBackwardsTime;
import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;
import org.usfirst.frc.team6560.robot.commands.DropGear;
import org.usfirst.frc.team6560.robot.commands.StopDriveTime;
import org.usfirst.frc.team6560.robot.commands.TurnToAngle;

/**
 *
 */
public class CenterPegAutonomous extends CommandGroup {

    public CenterPegAutonomous() {
        // TODO: Verify if speed/drive time is accurate
    	addSequential(new DriveStraightTime(2, 0.4));
    	addSequential(new StopDriveTime(0.5));
    	addSequential(new DropGear(true));
    	addSequential(new StopDriveTime(0.5));
    	addSequential(new DriveStraightBackwardsTime(0.5, 0.7));
    	addSequential(new StopDriveTime(1));
    	addSequential(new DropGear(false));
    	addSequential(new TurnToAngle(45));
    	addSequential(new DriveStraightTime(1, 0.5));
    	addSequential(new TurnToAngle(270));
    	addSequential(new DriveStraightTime(1, 0.4));
    }
}
