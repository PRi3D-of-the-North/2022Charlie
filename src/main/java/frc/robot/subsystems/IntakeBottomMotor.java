package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeBottomMotor extends SubsystemBase {
    private final WPI_TalonSRX mMotor = new WPI_TalonSRX(Constants.INTAKE_BOTTOM_MOTOR);

    public IntakeBottomMotor() {
        mMotor.configFactoryDefault();
        mMotor.setInverted(true);
        mMotor.setNeutralMode(NeutralMode.Coast);
    }

    @Override
    public void periodic() {
    }

    public void setPercentOutput(double output) {
        mMotor.set(output);
    }
}
