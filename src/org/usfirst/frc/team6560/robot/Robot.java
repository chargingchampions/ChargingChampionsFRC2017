package org.usfirst.frc.team6560.robot;

import org.usfirst.frc.team6560.robot.subsystems.*;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static OI oi;

	//Subsystems
	public static Drive drive;
	public static GearMission gearMission;
	//public static VisionSubsystem vision;
	public static Hanger hanger;
	public static UsbCamera visionTrackingCamera;
	public static UsbCamera gearCamera;
	public static UsbCamera hangingCamera;
	
	Command autonomousCommand;
	
    public void robotInit() {
    	drive = new Drive();
		gearMission = new GearMission();	
		hanger = new Hanger();
		oi = new OI();
		visionTrackingCamera = CameraServer.getInstance().startAutomaticCapture();
		gearCamera = CameraServer.getInstance().startAutomaticCapture();
		hangingCamera = CameraServer.getInstance().startAutomaticCapture();
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
    	drive.ultra.setAutomaticMode(true);
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Gyro angle", drive.gyro.getAngle());
        SmartDashboard.putNumber("Ultra", drive.ultra.getRangeInches());
        System.out.println(drive.ultra.getRangeInches());
//TODO: Find how to add acceleration from gyro
// and ultrasonic data from NT
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
