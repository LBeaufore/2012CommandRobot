
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Joystick;

public class OI {

    private static OI instance = null;
    private static Joystick j1, j2, controller;

    private OI()
    {
        j1 = new Joystick(1);
        j2 = new Joystick(2);
        controller = new Joystick(3);
        //GO = new JoystickButton(j1, Joystick.ButtonType.kTrigger.value);
        //GO.whileHeld(new driveWithJoysticks());

    }

    public Joystick getRightJoy()
    {
        return j2;
    }

    public Joystick getLeftJoy()
    {
        return j1;
    }

    public Joystick getController()
    {
        return controller;
    }

    public static OI getInstance()
    {
    if (instance == null)
            instance = new OI();
        return instance;
    }
}
