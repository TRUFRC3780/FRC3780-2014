/*
* Copyright 2014 FRC3780 (Brian Fogarty) Licensed under the
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

package org.usfirst.frc3780;
import java.util.*;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// ANDY DOES NOT LIKE USING PUBLIC STATIC FINAL INTS
        // ANDY FIX YOUR MAPS AND USE PUBLIC STATIC FINAL INTS
        // sorrynotsorry
		//
		
		
	// ಠ_ಠ
	// -Andy
		public static class Drive {
			public static final int FRONT_LEFT  = 1;
			public static final int FRONT_RIGHT = 2;
			public static final int BACK_LEFT   = 3;
			public static final int BACK_RIGHT  = 4;
		}
		
		
	
	// Jaguars
	public static final int INSIDE_ROLLER_ID = 5;
	public static final int ARM_DRIVE_ID = 6;
	
	// Joysticks
	public static final int DRIVE_JOYSTICK_PORT = 1;
	public static final int OPERATOR_JOYSTICK_PORT = 2;
	
	// Buttons
	public static final int TOGGLE_ARM_BUTTON_PORT = 1;
	public static final int TOGGLE_ROLLER_BUTTON_PORT = 2;

	// The piston ids are currently random sample values
	public static final int[][] PISTON_IDS = { {4,6,1}, {4,6,3}, {4,8,0} };
    
    
}
