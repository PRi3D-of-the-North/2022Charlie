package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climber extends SubsystemBase {
    private final WPI_TalonFX mMotor = new WPI_TalonFX(Constants.CLIMBER_MOTOR);

    public Climber() {
        mMotor.configFactoryDefault();
        mMotor.setInverted(false);
        mMotor.setNeutralMode(NeutralMode.Brake);
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
