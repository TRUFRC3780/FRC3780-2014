/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc3780.commands;


import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3780.robot.OI;
import org.usfirst.frc3780.subsystems.Catapult; 

/**
 *
 * @author Owner1
 */
public class Shoot extends CommandBase {
    
    public Shoot() {
        requires(Catapult);
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



