package org.usfirst.frc.team6560.robot;

import org.usfirst.frc.team6560.robot.subsystems.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static OI oi;

	//Subsystems
	public static Drive drive;
	public static Pneumatics gearMission;
	//public static VisionSubsystem vision;
	public static Hanger hanger;
	
	Command autonomousCommand;
	
    public void robotInit() {
    	drive = new Drive();
		gearMission = new Pneumatics();	
		hanger = new Hanger();
		oi = new OI();
    }
	
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
    
    }
    public void autonomousPeriodic() {
            Scheduler.getInstance().run();
    }

    public void teleopInit() {
    	if(autonomousCommand != null)
    		autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Ultrasound Distance", gearMission.ultrasound.getVoltage());
        SmartDashboard.putNumber("Gyro angle", drive.gyro.getAngle());
    	SmartDashboard.putString("Gear status", gearMission.getGearShiftStatus());
    	SmartDashboard.putNumber("POV", oi.getPOV());
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
