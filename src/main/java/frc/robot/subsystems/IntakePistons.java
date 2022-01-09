package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakePistons extends SubsystemBase {
    private final DoubleSolenoid mPistons = new DoubleSolenoid(PneumaticsModuleType.REVPH,
            Constants.INTAKE_SOLENOID_FORWARD, Constants.INTAKE_SOLENOID_REVERSE);

    public IntakePistons() {
    }

    @Override
    public void periodic() {
    }

    public void setPistonsState(boolean extended) {
        if (extended) {
            mPistons.set(Value.kReverse);
        } else {
            mPistons.set(Value.kForward);
        }
    }
}
