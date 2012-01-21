/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.templates.subsystems.Drive;
import edu.wpi.first.wpilibj.templates.OI;

/**
 *
 * @author 1014
 */
public class DriveWithJoystick extends CommandBase {

    private Drive mech;

    public DriveWithJoystick() 
    {
        mech = Drive.getInstance();
        requires(mech);
        System.out.println("DrvWthJystkInit");
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        mech.mechDrive(OI.getInstance().getLeftJoy(), OI.getInstance().getRightJoy());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}