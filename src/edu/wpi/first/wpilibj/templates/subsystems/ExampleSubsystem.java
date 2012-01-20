
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private static ExampleSubsystem instance;

     public static ExampleSubsystem getInstance()
    {
        if(instance == null)
        {
            instance = new ExampleSubsystem();
            //instance.setDefaultCommand(new ExampleCommand);
        }
        return instance;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

