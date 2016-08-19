package com.team5115.statemachines;

public class StateMachineBase {

	public int state = 0;
	public int lastState = 0;

	public StateMachineBase() {}

	public void setState(int s) {
		lastState = state;
		state = s;
	}

	public void update() {}

}
