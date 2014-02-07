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
	private static final Map<String,Integer> drive = new HashMap<String,Integer>();
	static {
		drive.put("front-left",    2);
		drive.put("front-right",   3);
		drive.put("back-left",     4);
		drive.put("back-right",    5);
	}
	
	
	public static int getDriveID(String s) {
		return drive.get(s);
	}
	
	
    // Jaguars
    public static final int CHASSIS_FRONT_LEFT_DRIVE_ID = 2;
    public static final int CHASSIS_FRONT_RIGHT_DRIVE_ID = 3;
    public static final int CHASSIS_REAR_LEFT_DRIVE_ID = 4;
    public static final int CHASSIS_REAR_RIGHT_DRIVE_ID = 5;


	// The piston ids are currently random sample values
	public static final int[][] PISTON_IDS = { {4,6,1}, {4,6,3}, {4,8,0} };
    
    
}
