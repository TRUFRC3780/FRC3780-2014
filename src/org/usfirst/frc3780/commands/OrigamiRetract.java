package org.usfirst.frc3780.commands;

import edu.wpi.first.wpilibj.*;

public class OrigamiRetract {
	public void execute() {
		origami.retractAll();
	}
	
	pubblic boolean isFinished() {
		return !origami.isExtended();
	}
}