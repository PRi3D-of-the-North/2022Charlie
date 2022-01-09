package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeTopMotor;

public class IntakeTopMotorSetPercentOutput extends CommandBase {
    private final IntakeTopMotor mIntakeTopMotor;
    private double mOutput;

    public IntakeTopMotorSetPercentOutput(IntakeTopMotor intakeTopMotor, double output) {
        mIntakeTopMotor = intakeTopMotor;
        mOutput = output;
        addRequirements(mIntakeTopMotor);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        mIntakeTopMotor.setPercentOutput(mOutput);
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
