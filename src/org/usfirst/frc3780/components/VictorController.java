package org.usfirst.frc3780.components;

import edu.wpi.first.wpilibj.*;

public class VictorController extends Controller {
	private final Victor victor;
	
	public VictorController(int channel) {
		victor = new Victor(channel);
	}
	
	public VictorController(int slot, int channel) {
		victor = new Victor(slot, channel);
	}
	
	// -100-100
	public void set(double speed) {
		victor.set(speed / 100);
	}
	
	public double get() {
		return victor.get() * 100;
	}
}