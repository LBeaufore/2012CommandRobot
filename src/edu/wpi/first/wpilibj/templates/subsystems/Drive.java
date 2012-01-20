
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class Drive extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive mechanum;
    private static Drive instance;

    public static Drive getInstance()
    {
        if(instance == null)
            instance = new Drive();
        return instance;
    }

    private Drive()
    {
         mechanum = new RobotDrive(new Victor(3), new Victor(4), new Victor(1), new Victor(2));
         setDefaultCommand(new DriveWithJoystick());
         System.out.println("Done 1");
    }

    public void mechDrive(Joystick j1, Joystick j2)
    {
        new Victor(1).set(j1.getY());
        //mechanum.mecanumDrive_Cartesian(j1.getY(), j1.getX(), j2.getX(), 0);
    }

     public void initDefaultCommand()
     {
         setDefaultCommand(new DriveWithJoystick());
     }
}

