package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
    WPI_TalonFX mMotor = new WPI_TalonFX(Constants.SHOOTER_MOTOR);

    public Shooter() {
        mMotor.configFactoryDefault();
        mMotor.setInverted(false);
        mMotor.setNeutralMode(NeutralMode.Coast);
    }

    @Override
    public void periodic() {
    }

    public void setPercentOutput(double output) {
        if (output > 1.0) {
            output = 1.0;
        } else if (output < -1.0) {
            output = -1.0;
        }

        mMotor.set(output);
    }
}
