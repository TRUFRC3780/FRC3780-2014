/*
* Copyright 2014 FRC3780 (B. Fogarty, E. Rothchild, A. Lee) Licensed under the
* Educational Community License, Version 2.0 (the "License"); you may
* not use this file except in compliance with the License. You may
* obtain a copy of the License at
* 
* http://www.opensource.org/licenses/ECL-2.0
* 
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an "AS IS"
* BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
* or implied. See the License for the specific language governing
* permissions and limitations under the License.
* 
*/

package org.usfirst.frc3780.subsystems;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;
// import the RobotMap constants

import org.usfirst.frc3780.components.*;

public class Origami extends Subsystem {
	private Piston[] pistons;
	
	
	public Origami() {
		// set up the array
		pistons = new Piston[RobotMap.PISTON_IDS.length];
		
		// Iterate through the piston ids
		for(int i = 0;i<pistons.length;i++) {
			// Get the array ids for the current piston
			int[] ids = RobotMap.PISTON_IDS[i];
			// Set up a piston
			Piston piston = new Piston( ids[0], ids[1], ids[2] );
			// Store it in the array
			pistons[i] = piston;
		}
	}
	
	public void extendAll() throws PistonException {
		for(int i = 0;i<pistons.length;i++) pistons[i].extend();
	}
	
	public void retractAll()  throws PistonException {
		for(int i = 0;i<pistons.length;i++) pistons[i].retract();
	}
	
	public void toggleAll()  throws PistonException  {
		for(int i = 0;i<pistons.length;i++) pistons[i].toggle();
	}
	
	public boolean isExtended() throws PistonException {
		boolean extended = true;
		for(int i=0;i<pistons.length;i++) {
                        Piston piston = pistons[i];
			if(!piston.isExtended()) extended = false;
		}
		
		return extended;
	}
	
	public void initDefaultCommand() {
		// Default command currently unset
	}
}