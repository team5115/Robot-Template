package com.team5115.statemachines;

public class StateMachineBase {
	
	public int state = 0;
	public int lastState = 0;
	
	public StateMachineBase() {}
	
	public void setState(int s) {
		lastState = state;
		state = s;
	}
	
	public void start() {
		System.out.println(this.getClass().getName() + " started");
		setState(1);
	}
	
	public void update() {}
	
	public void end() {
		System.out.println(this.getClass().getName() + " ended");
		setState(0);
	}
	
	public boolean ended() {
		return state == 0;
	}

}
