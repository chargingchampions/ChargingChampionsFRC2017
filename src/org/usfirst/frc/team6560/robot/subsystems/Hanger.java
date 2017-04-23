package org.usfirst.frc.team6560.robot.subsystems;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6560.robot.RobotMap.Can;

public class Hanger extends Subsystem {
    CANTalon hangerMotor = new CANTalon(Can.MOTOR);
   
    public void runHanger() {
    	hangerMotor.set(-0.7);
    }
    
    /**
     * Stops hanger motor
     */
    public void stopHanger() {
    	hangerMotor.set(0.0);
    }
    
    /**
     * Runs hanger backwards at a speed of 0.2
     */
    public void runHangerBackwards() {
    	hangerMotor.set(0.2);
    }

    /**
     * Runs hanger forwards at a speed given by input value
     * 
     * @param num	Input value corresponding to speed to run hanger motor
     */
    public void runHangerSlider(double num) {
    	hangerMotor.set(num);
    }
    public void initDefaultCommand() {
    }
}

