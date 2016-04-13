
package com.team5115.robot;

import com.team5115.statemachines.ArcadeDrive;
import com.team5115.systems.DriveTrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;

public class Robot extends IterativeRobot {
	
	public static DriveTrain drivetrain;
	
	public static ArcadeDrive ad;
	
    public void robotInit() {
    	drivetrain = new DriveTrain();
    	
    	ad = new ArcadeDrive();
    }
    
    public void autonomousInit() {
    	
    }

    public void autonomousPeriodic() {
    	Timer.delay(0.001);
    }
    
    public void teleopInit() {
    	ad.start();
    }
    
    public void teleopPeriodic() {
        ad.update();
        
        Timer.delay(0.001);
    }
    
    public void disabledInit() {
    	ad.end();
    }
    
    public void disabledPeriodic() {
    	Timer.delay(0.001);
    }
    
}
