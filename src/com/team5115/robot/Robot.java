
package com.team5115.robot;

import com.team5115.statemachines.CarDrive;
import com.team5115.systems.DriveTrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;

public class Robot extends IterativeRobot {
	
	public static DriveTrain drivetrain;
	
	public static CarDrive cd;
	
    public void robotInit() {
    	drivetrain = new DriveTrain();
    	
    	cd = new CarDrive();
    }
    
    public void autonomousInit() {}

    public void autonomousPeriodic() {
    	Timer.delay(0.005);
    }
    
    public void teleopInit() {
    	cd.setStcte(1);
    }
    
    public void teleopPeriodic() {
        cd.update();
        
        Timer.delay(0.005);
    }
    
    public void disabledInit() {
    	cd.setState(0);
    }
    
    public void disabledPeriodic() {
    	Timer.delay(0.005);
    }
    
}
