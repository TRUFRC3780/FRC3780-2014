package org.usfirst.frc3780.components;

import edu.wpi.first.wpilibj.*;

public class VictorRoller extends Roller {
	private final Victor victor;
	
	public VictorRoller(int channel) {
		victor = new Victor(channel);
	}
	
	public VictorRoller(int slot, int channel) {
		victor = new Victor(slot, channel);
	}
	
	// 0-100
	public void set(double speed) {
		victor.set(speed / 100);
	}
	
	public double get() {
		return victor.get() * 100;
	}
}