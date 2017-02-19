package org.usfirst.frc.team6560.robot.subsystems;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import org.usfirst.frc.team6560.robot.RobotMap.Can;
import org.usfirst.frc.team6560.robot.commands.DriveWithJoysticks;

public class Drive extends Subsystem {
    CANTalon leftTopMotor = new CANTalon(Can.LEFT_FWD_MOTOR);
    CANTalon leftBottomMotor = new CANTalon(Can.LEFT_REAR_MOTOR);
    CANTalon rightTopMotor = new CANTalon(Can.RIGHT_FWD_MOTOR);
    CANTalon rightBottomMotor = new CANTalon(Can.RIGHT_REAR_MOTOR);
    RobotDrive drivetrain = new RobotDrive(leftTopMotor, leftBottomMotor, rightTopMotor, rightBottomMotor);
    public ADXRS450_Gyro gyro = new ADXRS450_Gyro();
    
    double kP = 0.03;

    public Drive() {
    	gyro.calibrate();
    }
    
    public void driveWithJoysticks(double left, double right) {
    	drivetrain.tankDrive(left, right);
    }
    
    public void driveStraight() {
    	gyro.reset();
    	double angle = gyro.getAngle();
    	drivetrain.drive(1.0, kP * angle);
    }
    
    public void driveStraightBackwards() {
    	gyro.reset();
    	double angle = gyro.getAngle();
    	drivetrain.drive(-1.0, kP * angle);
    }
    
    public void spinLeft() {
    	leftTopMotor.set(0.7);
    	leftBottomMotor.set(0.7);
    	rightTopMotor.set(0.7);
    	rightBottomMotor.set(0.7);
    }
    
    public void spinRight() {
    	leftTopMotor.set(-0.7);
    	leftBottomMotor.set(-0.7);
    	rightTopMotor.set(-0.7);
    	rightBottomMotor.set(-0.7);
    }
    
    public void turnToAngle(int angle) {
    	
    }
    
    public void stop() {
    	leftTopMotor.set(0);
    	leftBottomMotor.set(0);
    	rightTopMotor.set(0);
    	rightBottomMotor.set(0);
    }
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticks());
    }
}
