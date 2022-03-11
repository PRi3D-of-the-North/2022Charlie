package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeTopMotor extends SubsystemBase {
    private final CANSparkMax mMotor = new CANSparkMax(Constants.INTAKE_TOP_MOTOR, MotorType.kBrushless);

    public IntakeTopMotor() {
        mMotor.restoreFactoryDefaults();
        mMotor.setInverted(true);
        mMotor.setIdleMode(IdleMode.kBrake);
        mMotor.burnFlash();
    }

    @Override
    public void periodic() {
    }

    public void setPercentOutput(double output) {
        mMotor.set(output);
    }
}
