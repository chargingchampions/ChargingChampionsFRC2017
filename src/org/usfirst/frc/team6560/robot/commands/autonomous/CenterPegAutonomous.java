package org.usfirst.frc.team6560.robot.commands.autonomous;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team6560.robot.commands.DeployGear;
import org.usfirst.frc.team6560.robot.commands.DriveStraightBackwardsTime;
import org.usfirst.frc.team6560.robot.commands.DriveStraightTime;
import org.usfirst.frc.team6560.robot.commands.ResetGear;
import org.usfirst.frc.team6560.robot.commands.StopDriveTime;
import org.usfirst.frc.team6560.robot.commands.TurnToAngle;

/**
 * Time-based autonomous program that drops gear on right peg
 */
public class CenterPegAutonomous extends CommandGroup {

    public CenterPegAutonomous() {   	
    	addSequential(new DriveStraightTime(0.9, 0.5));
    	addSequential(new DriveStraightTime(1.9, 0.17));
    	addSequential(new TurnToAngle(1, 0.25));
    	addSequential(new TurnToAngle(-2, 0.25));
    	addSequential(new TurnToAngle(1, 0.25));
    	addSequential(new DriveStraightTime(0.5, 0.3));
    	addSequential(new DeployGear());
    	addParallel(new DriveStraightBackwardsTime(0.2, 0.25));
    	addSequential(new DriveStraightBackwardsTime(0.5, 0.6));
    	Timer.delay(1.0);
    	addSequential(new ResetGear());
    	addSequential(new StopDriveTime(1));
    }
}
