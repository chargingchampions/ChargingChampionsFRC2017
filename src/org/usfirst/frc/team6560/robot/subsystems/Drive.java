package org.usfirst.frc.team6560.robot.subsystems;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Ultrasonic;

import org.usfirst.frc.team6560.robot.RobotMap.Can;
import org.usfirst.frc.team6560.robot.commands.DriveWithJoysticks;

public class Drive extends Subsystem {
    CANTalon leftTopMotor = new CANTalon(Can.LEFT_FWD_MOTOR);
    CANTalon leftBottomMotor = new CANTalon(Can.LEFT_REAR_MOTOR);
    CANTalon rightTopMotor = new CANTalon(Can.RIGHT_FWD_MOTOR);
    CANTalon rightBottomMotor = new CANTalon(Can.RIGHT_REAR_MOTOR);
    public RobotDrive drivetrain = new RobotDrive(leftTopMotor, leftBottomMotor, rightTopMotor, rightBottomMotor);
    public ADXRS450_Gyro gyro = new ADXRS450_Gyro();
    public Ultrasonic ultra = new Ultrasonic(0, 1);
    
    private double kP = 0.03;

    public Drive() {
    	gyro.calibrate();
    	gyro.reset();
    }
    
    public void driveWithJoysticks(double left, double right) {
    	drivetrain.tankDrive(left, right);
    }
    
    public void driveStraight(double speed) {
    	speed = Math.abs(speed);
      	int angle = getGyroAngle();
    	drivetrain.drive(speed, -1 * angle * kP);
    }

    public void driveStraightBackwards(double speed) {
    	speed = Math.abs(speed);
    	int angle = getGyroAngle();
    	drivetrain.drive(-1 * speed, angle * kP);
    }
    
    public void spinRight(double speed) {
    	speed =  Math.abs(speed);
    	leftTopMotor.set(speed);
    	leftBottomMotor.set(speed);
    	rightTopMotor.set(speed);
    	rightBottomMotor.set(speed);
    }
    
    public void spinLeft(double speed) {
    	speed = Math.abs(speed);
    	leftTopMotor.set(-1 * speed);
    	leftBottomMotor.set(-1 * speed);
    	rightTopMotor.set(-1 * speed);
    	rightBottomMotor.set(-1 * speed);
    }
    
    public int getGyroAngle() {
    	return (int)Math.round(gyro.getAngle());
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
