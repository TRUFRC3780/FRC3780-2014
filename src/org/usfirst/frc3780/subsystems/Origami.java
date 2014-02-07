package org.usfirst.frc3780.subsystems;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// import the RobotMap constants
import static org.usfirst.frc3780.RobotMap.*;

import org.usfirst.frc3780.components.Piston;

public class Origami extends Subsystem {
	private Piston[] pistons;
	
	
	public Origami() {
		// set up the array
		pistons = new Piston[PISTON_IDS.length];
		
		// Iterate through the piston ids
		for(int i = 0;i<pistons.length;i++) {
			// Get the array ids for the current piston
			int[] ids = PISTON_IDS[i];
			// Set up a piston
			Piston piston = new Piston( ids[0], ids[1], ids[2] );
			// Store it in the array
			pistons[i] = piston;
		}
	}
	
	public void extendAll() {
		for(Piston piston : pistons) piston.extend();
	}
	
	public void retractAll() {
		for(Piston piston : pistons) piston.retract();
	}
	
	public void toggleAll() {
		for(Piston piston : pistons) piston.toggle();
	}
	
	public boolean isExtended() {
		boolean extended = true;
		for(Piston piston : pistons) {
			if(!piston.isExtended()) extended = false;
		}
		
		return extended;
	}
	
	public void initDefaultCommand() {
		// Default command currently unset
	}
}