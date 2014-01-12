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

import edu.wpi.first.wpilibj.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // Jaguars
    final public static int SLINGJAGID = 2;
    final public static int WINCHJAGID = 4;
    final public static int ROLLERJAGID = 3;
    final public static int CATAPULTJAGID = 5;
    
    // Joysticks
    final public static int CATAPULTJOYSTICKPORT = 1;
    final public static int SLINGSHOTJOYSTICKPORT = 2;
    
    // Buttons
    final public static int FIREBUTTONPORT = 1;
    final public static int RELOADBUTTONPORT = 1;
    
}
