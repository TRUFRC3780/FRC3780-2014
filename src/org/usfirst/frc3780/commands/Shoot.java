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

package org.usfirst.frc3780.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3780.OI;
import org.usfirst.frc3780.subsystems.Catapult; 

/**
 *
 * @author Eric
 */
public class Shoot extends CommandBase {
    
    public Shoot() {
        requires(catapult);
    }
    
    protected void initialize() {
        
    }
    
    protected void execute() {
        
    }

    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
        
    }
    
    protected void interrupted() {
        
    }

}



