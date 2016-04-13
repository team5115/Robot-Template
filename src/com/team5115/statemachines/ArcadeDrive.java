package com.team5115.statemachines;

import com.team5115.robot.InputManager;
import com.team5115.robot.Robot;

public class ArcadeDrive extends StateMachineBase {
	
	public void update() {
		switch (state) {
		case 1:
			
			// STATE 1
			double x = InputManager.getX();
			double y = InputManager.getY();
			double t = InputManager.getThrottle();
			
			Robot.drivetrain.drive(y - x, y + x, t);
			break;
			
		}
	}

}
