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

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // Motor Controllers
    public static final int CHASSIS_FRONT_LEFT_DRIVE_ID = 4;
    public static final int CHASSIS_FRONT_RIGHT_DRIVE_ID = 2;
    public static final int CHASSIS_REAR_LEFT_DRIVE_ID = 3;
    public static final int CHASSIS_REAR_RIGHT_DRIVE_ID = 1;
    
    public static final int ROLLER_DRIVE_ID = 6;
    public static final int ARM_DRIVE_ID = 5;
    
    // Compressor
    public static final int COMPRESSOR_PRESSURE_SWITCH_CHANNEL = 1;
    public static final int COMPRESSOR_RELAY_CHANNEL = 1;
    
    // Solenoid
    public static final int SHIFTERS_REVERSE_PORT = 1; // high gear
    public static final int SHIFTERS_FORWARD_PORT = 2; // low gear
    
    // Joysticks
    public static final int DRIVE_JOYSTICK_PORT = 1;
    public static final int OPERATOR_JOYSTICK_PORT = 2;
    
    // Buttons
    public static final int TOGGLE_ARM_BUTTON_PORT = 1;
    public static final int ROLLER_IN_BUTTON_PORT = 2;
    public static final int ROLLER_OUT_BUTTON_PORT = 3;
    public static final int SHIFT_HIGH_BUTTON_PORT = 3;
    public static final int SHIFT_LOW_BUTTON_PORT = 2;
    public static final int DRIVE_NORMAL_BUTTON_PORT = 4;
    public static final int DRIVE_INVERTED_BUTTON_PORT = 5;
    
    // Autonomous
    public static final double ROBOT_DRIVE_SPEED = -.5;
    public static final double ROLLER_DRIVE_SPEED = -1;
    
}
