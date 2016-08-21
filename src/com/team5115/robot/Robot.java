
package com.team5115.robot;

import com.team5115.statemachines.HoffDrive;
import com.team5115.systems.DriveTrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;

public class Robot extends IterativeRobot {

	public static DriveTrain drivetrain;

	public static HoffDrive hd;

	public void robotInit() {
		drivetrain = new DriveTrain();

		hd = new HoffDrive();
	}

	public void autonomousInit() {}

	public void autonomousPeriodic() {
		Timer.delay(0.005);
	}

	public void teleopInit() {
		hd.setStcte(1);
	}

	public void teleopPeriodic() {
		hd.update();

		Timer.delay(0.005);
	}

	public void disabledInit() {
		hd.setState(0);
	}

	public void disabledPeriodic() {
		Timer.delay(0.005);
	}

}
