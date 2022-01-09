package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeBottomMotor;

public class IntakeBottomMotorSetPercentOutput extends CommandBase {
    private final IntakeBottomMotor mIntakeBottomMotor;
    private double mOutput;

    public IntakeBottomMotorSetPercentOutput(IntakeBottomMotor intakeBottomMotor, double output) {
        mIntakeBottomMotor = intakeBottomMotor;
        mOutput = output;
        addRequirements(mIntakeBottomMotor);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        mIntakeBottomMotor.setPercentOutput(mOutput);
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
