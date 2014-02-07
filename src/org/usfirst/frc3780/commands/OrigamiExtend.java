package org.usfirst.frc3780.commands;

import edu.wpi.first.wpilibj.*;

public class OrigamiExtend extends CommandBase {
	public void execute() {
		origami.extendAll();
	}
	
	public boolean isFinished() {
		return origami.isExtended();
	}
}