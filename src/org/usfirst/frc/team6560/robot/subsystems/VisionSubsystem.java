package org.usfirst.frc.team6560.robot.subsystems;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.vision.VisionThread;
import edu.wpi.first.wpilibj.vision.VisionRunner;
import edu.wpi.cscore.UsbCamera;
import Vision.GripPipeline;

public class VisionSubsystem extends Subsystem implements VisionRunner.Listener<GripPipeline>{

	private CameraServer cam0 = CameraServer.getInstance();
	GripPipeline gp;
	VisionThread vt;
	
	public VisionSubsystem() {
		//TODO: Connect cameras and find devs for each, for now 1 is front cam and 2 is back cam
		CameraServer.getInstance().startAutomaticCapture(0);
		CameraServer.getInstance().startAutomaticCapture(1);
		final UsbCamera gearCam = new UsbCamera("Gear Camera", 0);
		final UsbCamera frontCam = new UsbCamera("Front Camera", 1);
		final UsbCamera backCam = new UsbCamera("Back Camera", 2);
		
		gp = new GripPipeline();
		vt = new VisionThread(gearCam, gp, this);
		vt.start();
	}

	public void copyPipelineOutputs(GripPipeline gp) {
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

