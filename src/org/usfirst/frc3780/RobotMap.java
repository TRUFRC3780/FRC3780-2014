/*
* Copyright 2014 FRC3780 (Brian Fogarty + Eric Rothchild) Licensed under the
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
    final public static int WINCHJAGID = 3;
    final public static int CATAPULTLEFTJAGID = 1;
    final public static int CATAPULTRIGHTJAGID = 2;
    
    // Joysticks
    final public static int CATAPULTJOYSTICKPORT = 1;
    final public static int WINCHJOYSTICKPORT = 2;
    
    // Buttons
    final public static int FLINGBUTTONPORT = 1;
    final public static int WINCHUPBUTTONPORT = 3;
    final public static int WINCHDOWNBUTTONPORT = 2;
    
    // Timers and speeds
    final public static double WINCHUPSPEED = -1;
    final public static double WINCHDOWNSPEED = 1;
    final public static double CATAPULTTIMER = 0.5;
    final public static double CATAPULTSPEED = 1;
    
}
